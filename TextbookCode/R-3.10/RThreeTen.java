public class RThreeTen {
    public int size(Node<E> head) {
        Node<E> current = head;
        int result = 0;
        while (current.getNext() != head) {
            result++;
            current = current.getNext();
        }

        return result;
    }
}