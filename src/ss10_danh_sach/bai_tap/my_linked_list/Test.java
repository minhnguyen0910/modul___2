package ss10_danh_sach.bai_tap.my_linked_list;

public class Test {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(1);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.add(4, 9);
        ll.add(4, 9);
        ll.remote(3);
        ll.remoteFirst();
        ll.remoteLast();
        ll.printList();
    }
}
