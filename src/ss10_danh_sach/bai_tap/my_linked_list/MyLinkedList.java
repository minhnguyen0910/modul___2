package ss10_danh_sach.bai_tap.my_linked_list;

public class MyLinkedList<E> {
    private Node head;
    private Node tail;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;

    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void remoteFirst() {
        Node temp = head;
        head = temp.next;
    }

    public void remoteLast() {
        Node current = head;
        for (int i = 0; i < numNodes - 2; i++) {
            current = current.next;
        }
        tail = current;
        current.next = null;
    }

    public void remote(int index) {
        Node temp = head;
        Node holder;
        if (index == 0) {
            remoteFirst();
        } else if (index == numNodes - 1) {
            remoteLast();
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = holder.next;
            numNodes--;
        }
    }

}
