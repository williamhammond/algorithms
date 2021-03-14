import java.util.Collections;
import java.util.Optional;

public class BinarySearchTree<Key extends Comparable<Key>, Value> {
  private Optional<Node> root;

  public BinarySearchTree () {
      this.root = Optional.empty();
  }

  public Optional<Value> get(Key key) {
    return Optional.empty();
  }

  public void put(Key key, Value value) {}

  public Key min() {
    return null;
  }

  public Key floor(Key key) {
    return null;
  }

  public Key select (int k) {
    return null;
  }

  public void delete(Key key) {}

  public Optional<Value> popMin() {
    return Optional.empty();
  }

  public Iterable<Key> getKeys() {
    return Collections.emptyList();
  }

  public int size() {
    return size(root);
  }

  private int size(Optional<Node> node) {
    if (node.isEmpty()) {
      return 0;
    }
    return node.get().getNodeCount();
  }

  private class Node {
    private Key key;
    private Value value;
    private Optional<Node> left, right;
    private int nodeCount;

    public int getNodeCount() {
      return this.nodeCount;
    }

    public Node(Key key, Value value, int nodeCount) {
      this.key = key;
      this.value = value;
      this.nodeCount = nodeCount;
    }
  }
}
