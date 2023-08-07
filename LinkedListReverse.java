public class LinkedListReverse {
    public ListNode reverse(ListNode head) {
  
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;                                                                              
            current.next = prev;                                                                               

            prev = current; 
            current = next; 
        }

        return prev; 
    }
    
    
    public static void main(String[] args) {
        LinkedListReverse linkedListReverse = new LinkedListReverse();

        // Создание списка: 1->2->3->4->5
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println("Исходный список:");
        printList(head);

        // Разворот списка
        head = linkedListReverse.reverse(head);

        System.out.println("Развёрнутый список:");
        printList(head);
    }


    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}