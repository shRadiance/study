package com.radiance.algorithm;

/**
 * @author sunhao
 * @date 2020/12/3 23:58
 * @Description:
 */
public class Offer51 {
    // 小夕学算法（2020-12-03）：https://mp.weixin.qq.com/s/Z0yOmaPg0To4yNqw1e_Ojg

/*  剑指offer51
输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。

     例如：

    给定二叉树 [3,9,20,null,null,15,7]，
        3
       / \
      9  20
        /  \
       15   7
     返回它的最大深度 3 。
     提示：

节点总数 <= 10000
注意：本题与主站 104 题相同：https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
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

    public static void main(String[] args) {
        Offer51 offer51 = new Offer51();
        TreeNode root = offer51.getTestTree();
        int treeDepth = maxDepth(root);
        System.out.println("二叉树的深度是:" + treeDepth);
    }

    static int maxDepth(TreeNode root) {
        if (root == null) {return 0;}
        if (root.left == null && root.right == null) {return 1;}
        int leftTreeDepth = maxDepth(root.left);
        int rightTreeDepth = maxDepth(root.right);
        return leftTreeDepth > rightTreeDepth ? (leftTreeDepth + 1) : (rightTreeDepth + 1);
    }

    // 造一个测试的树
     TreeNode getTestTree() {
        TreeNode t9 = new TreeNode(9, null, null);
        TreeNode t1 = new TreeNode(1, null, null);
        TreeNode t7 = new TreeNode(7, null, null);
        TreeNode t2 = new TreeNode(2, t1, t7);
        TreeNode t3 = new TreeNode(3, t9, t2);
        return t3;
    }

}
