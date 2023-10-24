public class RThreeNine {
    public int size(Node<E> head) {
        Node<E> current = head;
        int result = 0;
        while (current.getNext() != null) {
            result++;
            current = current.getNext();
        }

        return result;
    }
}