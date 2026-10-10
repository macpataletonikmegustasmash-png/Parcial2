public class SinglyLinkedList<T> {

    private Node<T> head;

    private int size;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void traverse() {
        Node<T> current = head;
        int count = 0;
        while (current != null) {
            if (count == size - 1){
                System.out.print(current);
            }else {
                System.out.print(current + ", ");
            }
            current = current.getNext();
            count++;
        }
        System.out.println();
    }

    public void insertFirst(T data) {
        Node<T> newNode = new Node<>(data);

        newNode.setNext(head);

        head = newNode;
        size++;
    }


    public void insertLast(T data) {
        Node<T> newNode = new Node<>(data);

        if (isEmpty()) {
            head = newNode;
        } else {

            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }


    public boolean remove(T data) {

        if (isEmpty()) {
            return false;
        }

        if (head.getData().equals(data)) {
            head = head.getNext();
            size--;
            return true;
        }

        Node<T> previous = head;
        Node<T> current = head.getNext();

        while (current != null && !current.getData().equals(data)) {
            previous = current;
            current = current.getNext();
        }

        if (current == null) {
            return false;
        }

        previous.setNext(current.getNext());
        size--;
        return true;
    }

    public void clear() {
        head = null;
        size = 0;
    }
}
