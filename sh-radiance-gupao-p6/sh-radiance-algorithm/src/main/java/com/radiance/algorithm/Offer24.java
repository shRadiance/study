package com.radiance.algorithm;

/**
 * @author sunhao
 * @date 2020/12/4 14:58
 * @Description:
 */
public class Offer24 {

    /*剑指 Offer 24. 反转链表
    定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。

        示例:

        输入: 1->2->3->4->5->NULL
        输出: 5->4->3->2->1->NULL
         
        限制：

        0 <= 节点个数 <= 5000

        注意：本题与主站 206 题相同：https://leetcode-cn.com/problems/reverse-linked-list/

        来源：力扣（LeetCode）
        链接：https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/

    public static void main(String[] args) {
        Offer24 offer24 = new Offer24();
        ListNode test = offer24.createTest();
        ListNode result = offer24.reverseList(test);
        System.out.println(result.toString());
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x, ListNode node) {
            this.val = x;
            this.next = node;
        }
    }

    // 单链表反转方法
    ListNode reverseList(ListNode head) {
        if (head == null) { return head; }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    // 创建一个测试的链表
    ListNode createTest() {
        ListNode n5 = new ListNode(5, null);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);
        return n1;
    }

}
