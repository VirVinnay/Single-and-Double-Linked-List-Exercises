public class RThreeSix<E> {
    public static void main(String[] args) {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();

        list.add(1);
        list.add(34);
        list.add(87);
        list.add(4);
        list.add(7);
        list.add(1234);

        System.out.println(findSecondToLast(list).getData());
    }

    public static <E>Node<E> findSecondToLast(SingleLinkedList<E> list) {
        Node<E> current = list.getHead();

        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        return current;

    }
}