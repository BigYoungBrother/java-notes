package com.young.leetcode;

/**
 * 链表中两数之和
 *
 * @author Young
 * @Date 2021-05-12 22:28
 * @see <a href="https://leetcode-cn.com/problems/add-two-numbers/">leet-code-2: 两数相加</a>
 */
public class AddTwoNumber {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode listNode = addTwoNumbers(l1, l2);
        ListNode reslt = listNode;
        while (reslt != null) {
            System.out.println(reslt.val);
            reslt = reslt.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headerIndex = null;
        ListNode header = null;
        ListNode l1Index = l1;
        ListNode l2Index = l2;
        int temp = 0;
        while (l1Index != null || l2Index != null || temp != 0) {
            int current = temp;
            if (l1Index != null && l2Index != null) {
                current = current + l1Index.val + l2Index.val;
                l1Index = l1Index.next;
                l2Index = l2Index.next;
            } else if (l1Index != null && l2Index == null) {
                current = current + l1Index.val;
                l1Index = l1Index.next;
            } else if (l1Index == null && l2Index != null) {
                current = current + l2Index.val;
                l2Index = l2Index.next;
            }
            if (current >= 10) {
                temp = current / 10;
                current = current % 10;
            } else {
                temp = 0;
            }
            ListNode next = new ListNode(current);
            if (header == null) {
                header = next;
            } else {
                headerIndex.next = next;
            }
            headerIndex = next;
        }
        return header;
    }

    static class ListNode {
        int val;

        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

}


