import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinarySearchTreeTest {
  @ParameterizedTest
  @MethodSource("providesItShouldPut")
  public void itShouldPut(BinarySearchTree<Integer, Integer> tree, Integer key, Integer expected) {

  }

  private static Stream<Arguments> providesItShouldPut() {
    return Stream.of(
        Arguments.of(new BinarySearchTree<Integer, Integer>(), 0, 0));
  }

  @ParameterizedTest
  @MethodSource("providesItShouldGetKeys")
  public void itShouldGetKeys(BinarySearchTree<Integer, Integer> tree, Iterable<Integer> expected) {
    assertEquals(tree.getKeys(), expected);
  }

  private static Stream<Arguments> providesItShouldGetKeys() {
    return Stream.of(
        Arguments.of(new BinarySearchTree<Integer, Integer>(), Collections.emptyList()));
  }

  @ParameterizedTest
  @MethodSource("providesItShouldGetFloor")
  public void itShouldGetFloor(BinarySearchTree<Integer, Integer> tree, Integer expected) {}

  private static Stream<Arguments> providesItShouldGetFloor() {
    return Stream.of(Arguments.of(new BinarySearchTree<Integer, Integer>(), 0));
  }

  @ParameterizedTest
  @MethodSource("providesItShouldSelect")
  public void itShouldSelect(
      BinarySearchTree<Integer, Integer> tree, Integer key, Optional<Integer> expected) {
    assertEquals(tree.get(key), expected);
  }

  private static Stream<Arguments> providesItShouldSelect() {
    return Stream.of(Arguments.of(new BinarySearchTree<Integer, Integer>(), 0, Optional.empty()));
  }

  @ParameterizedTest
  @MethodSource("providesItShouldDelete")
  public void itShouldDelete(BinarySearchTree<Integer, Integer> tree, Integer key) {}

  private static Stream<Arguments> providesItShouldDelete() {
    return Stream.of(Arguments.of(new BinarySearchTree<Integer, Integer>(), 0));
  }

  @ParameterizedTest
  @MethodSource("providesItShouldGetSize")
  public void itShouldGetSize(BinarySearchTree<Integer, Integer> tree, Integer size) {
    assertEquals(tree.size(), size);
  }

  private static Stream<Arguments> providesItShouldGetSize() {
    return Stream.of(Arguments.of(new BinarySearchTree<Integer, Integer>(), 0));
  }

  @ParameterizedTest
  @MethodSource("providesItShouldGetMin")
  public void itShouldGetMin(BinarySearchTree<Integer, Integer> tree, int min) {}

  private static Stream<Arguments> providesItShouldGetMin() {
    return Stream.of(Arguments.of(new BinarySearchTree<Integer, Integer>(), 0));
  }

  private static BinarySearchTree<Integer, Integer> buildTree(Integer... args) {
    BinarySearchTree<Integer, Integer> tree = new BinarySearchTree<>();
    for (Integer input : args) {
      tree.put(input, input);
    }
    return tree;
  }
}
