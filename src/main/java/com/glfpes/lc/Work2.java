package com.glfpes.lc;

public class Work2 {
    public static void main(String[] args) {
        // init l1
        ListNode l1 = new ListNode(2);
        ListNode l1_2 = new ListNode(4);
        ListNode l1_3 = new ListNode(3);
        l1_2.next = l1_3;
        l1.next = l1_2;
        printListNode(l1);

        // init l2
        ListNode l2 = new ListNode(5);
        ListNode l2_2 = new ListNode(6);
        ListNode l2_3 = new ListNode(4);
        //l2_2.next = l2_3;
        l2.next = l2_2;
        printListNode(l2);

        ListNode l3 = addTwoNumbers(l1, l2);
        printListNode(l3);
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        ListNode pointer = null;

        int next = 0;
        while (l1 != null || l2 != null || next != 0) {
            int l1_val = 0;
            int l2_val = 0;
            if (l1 != null) {
                l1_val = l1.val;
            }
            if (l2 != null) {
                l2_val = l2.val;
            }

            int sum = l1_val + l2_val + next;
            next = sum / 10;
            ListNode l = new ListNode(sum % 10);
            if (l3 == null) {
                l3 = l;
                pointer = l3;
            } else {
                pointer.next = l;
                pointer = l;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return l3;
    }

    private static void printListNode(ListNode listNode) {
        StringBuilder sb = new StringBuilder().append(listNode.val);
        while (listNode.next != null) {
            sb.append("->").append(listNode.next.val);
            listNode = listNode.next;
        }
        System.out.println(sb.toString());
    }
}
