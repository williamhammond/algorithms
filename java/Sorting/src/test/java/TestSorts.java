import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.List;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class TestSorts {
    private static final List<Consumer<Comparable[]>> FUNCTIONS =
            List.of(
                    Sorts::selectionSort
            );

    @ParameterizedTest
    @MethodSource("providesSimpleSort")
    public void itSimpleSorts(
            Consumer<Comparable[]> function, Comparable[] input, Comparable[] output) {
        function.accept(input);
        assertArrayEquals(output, input);
    }

    private static Stream<Arguments> providesSimpleSort() {
        Stream.Builder<Arguments> streamBuilder = Stream.builder();
        for (Consumer<Comparable[]> function : FUNCTIONS) {
            streamBuilder.add(Arguments.of(function, new Integer[]{1, 2, 3}, new Integer[]{1, 2, 3}));
            streamBuilder.add(
                    Arguments.of(function, new Character[]{'a', 'b', 'c'}, new Character[]{'a', 'b', 'c'}));
            streamBuilder.add(Arguments.of(function, new Integer[]{3, 2, 1}, new Integer[]{1, 2, 3}));
            streamBuilder.add(Arguments.of(function, new Integer[]{1, 1, 1}, new Integer[]{1, 1, 1}));
            streamBuilder.add(Arguments.of(function, new Integer[]{0, 1, -1}, new Integer[]{-1, 0, 1}));
        }

        return streamBuilder.build();
    }
}
