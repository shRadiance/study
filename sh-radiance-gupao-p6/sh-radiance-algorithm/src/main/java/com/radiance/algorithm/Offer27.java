package com.radiance.algorithm;

/**
 * @author sunhao
 * @date 2020/12/4 20:16
 * @Description:
 */
public class Offer27 {

    /*剑指 Offer 27. 二叉树的镜像
    https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/
    小夕学算法：https://mp.weixin.qq.com/s?__biz=MzA5NjM5NTc5NQ==&mid=2247485332&idx=1&sn=470e2290597b170a557a484549eb5cc6&chksm=90b1f0e8a7c679fe39976d10f2f9984cf0c9b63e689c3ed370083cb88d8f735d3ef51bc786f3&scene=126&sessionid=1607060577&key=c719ea507b92ce14b69d195a153cdde25e664189b66e3586829a482cef831cab089fed201462225750042249c5a29e06ab7bf8de3476cc4b93a040a84af808d26a1f3987b699f8616a0cf3d2574e0a3f428ec36684c90e03ddb224b89a916765d84b7cd61681d25eb9fd77c72666d261c0bcfafa6c5ebaee17b7e3024301c413&ascene=1&uin=MTM1NDEwODE0MQ%3D%3D&devicetype=Windows+10+x64&version=6300002f&lang=zh_CN&exportkey=ATHzOWV3Xs7OKRuVEEj0xgU%3D&pass_ticket=itdepHCc9ooo27euvCCJL8gRZa75i7Y0deuV%2BgETAPiUKR5kS5K2rPg5JYzWJ6Hg&wx_header=0
        请完成一个函数，输入一个二叉树，该函数输出它的镜像。

        例如输入：

             4
           /   \
          2     7
         / \   / \
        1   3 6   9
        镜像输出：

             4
           /   \
          7     2
         / \   / \
        9   6 3   1



        示例 1：

        输入：root = [4,2,7,1,3,6,9]
        输出：[4,7,2,9,6,3,1]


        限制：

        0 <= 节点个数 <= 1000

        注意：本题与主站 226 题相同：https://leetcode-cn.com/problems/invert-binary-tree/
*/

    public static void main(String[] args) {
        Offer27 offer27 = new Offer27();
        TreeNode root = offer27.getTestTree();
        TreeNode result = offer27.mirrorTree(root);
        System.out.println(result);
    }

    // 还是使用递归算法
    TreeNode mirrorTree(TreeNode root) {
        if (root == null) { return root; }
        if (root.left == null && root.right == null) { return root; }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x, TreeNode left, TreeNode right) {
            val = x;
            this.left = left;
            this.right = right;
        }
    }

    // 造一个测试的树
    TreeNode getTestTree() {
        TreeNode t1 = new TreeNode(1, null, null);
        TreeNode t3 = new TreeNode(3, null, null);
        TreeNode t6 = new TreeNode(6, null, null);
        TreeNode t9 = new TreeNode(9, null, null);
        TreeNode t2 = new TreeNode(2, t1, t3);
        TreeNode t7 = new TreeNode(7, t6, t9);
        TreeNode t4 = new TreeNode(4, t2, t7);
        return t4;
    }

}
