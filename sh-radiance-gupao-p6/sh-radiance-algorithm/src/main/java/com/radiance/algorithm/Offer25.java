package com.radiance.algorithm;

import java.util.List;

/**
 * @author sunhao
 * @date 2020/12/7 11:50
 * @Description:
 */
public class Offer25 {

    /* 小夕学算法：https://mp.weixin.qq.com/s?__biz=MzA5NjM5NTc5NQ==&mid=2247485551&idx=1&sn=a9f7ec6064f10842716e1ed85e36ecf9&chksm=90b1ff13a7c67605349c53a0e2dce34ea19d9036621092c169ddc35b43e6514cbd6a09458f74&scene=126&sessionid=1607309448&key=c719ea507b92ce14392940bf0e08e230fd619a1b2efff17395e5c20117b0f6e53417592c52488094e2fb51a375e47735d32538cae2e0340a646806542bd040e6e34d04088d38f031191d60986c7c7f485d54e8748fe0385531d80c237977bb264edf481d5ef47674848bd67c518ddf16ebca41e86e13f6c86480b50ca6ef7857&ascene=1&uin=MTM1NDEwODE0MQ%3D%3D&devicetype=Windows+10+x64&version=6300002f&lang=zh_CN&exportkey=AVSGnP52qu%2Byo3B5GJIFPak%3D&pass_ticket=2bwQwIYry%2F6M0EexbUCcwKBL1RanxBTchJi2Uts83%2BX1uJ3KraruY%2FP%2FguQD%2Bmce&wx_header=0
    *剑指 Offer 25. 合并两个排序的链表
        输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。

        示例1：

        输入：1->2->4, 1->3->4
        输出：1->1->2->3->4->4
        限制：

        0 <= 链表长度 <= 1000

        注意：本题与主站 21 题相同：https://leetcode-cn.com/problems/merge-two-sorted-lists/
    * */

    public static void main(String[] args) {
        Offer25 offer25 = new Offer25();
        ListNode l1 = offer25.create1();
        ListNode l2 = offer25.create2();
        ListNode result = offer25.mergeTwoLists(l1, l2);
        System.out.println(result);
    }

    ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) { return null; }
        ListNode tmp = new ListNode(-1, null);
        ListNode cur = tmp;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (l1 == null) { cur.next = l2; }
        if (l2 == null) { cur.next = l1; }
        return tmp.next;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }

    ListNode create1() {
        ListNode l4 = new ListNode(4, null);
        ListNode l2 = new ListNode(2, l4);
        ListNode l1 = new ListNode(1, l2);
        return l1;
    }

    ListNode create2() {
        ListNode l4 = new ListNode(4, null);
        ListNode l3 = new ListNode(3, l4);
        ListNode l1 = new ListNode(1, l3);
        return l1;
    }

}
