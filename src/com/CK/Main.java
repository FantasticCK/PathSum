package com.CK;

public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(4);
//        TreeNode node2 = new TreeNode(8);
//        TreeNode node3 = new TreeNode(11);
//        TreeNode node4 = new TreeNode(2);
//        TreeNode node5 = new TreeNode(13);
//        TreeNode node6 = new TreeNode(4);
//        TreeNode node6 = new TreeNode(4);
//        TreeNode node6 = new TreeNode(4);
//        TreeNode node9 = new TreeNode(7);
//        TreeNode node10 = new TreeNode(2);
//        TreeNode node11 = new TreeNode(1);
//        TreeNode node6 = new TreeNode(4);
//        TreeNode node13 = new TreeNode(9);
//        TreeNode node14 = new TreeNode(8);

        root.left = node1;
//        root.right = node2;
//        node1.left = node3;
//        node1.right = node4;
//        node2.left = node5;
//        node2.right = node6;
//        node3.left = node9;
//        node3.right = node10;
//        node6.left = node13;
//        node6.right = node11;

//        TreeNode root = new TreeNode(5);
//        TreeNode node1 = new TreeNode(4);
//        TreeNode node2 = new TreeNode(8);
//        TreeNode node3 = new TreeNode(11);
////        TreeNode node4 = new TreeNode(2);
//        TreeNode node5 = new TreeNode(13);
//        TreeNode node6 = new TreeNode(4);
////        TreeNode node6 = new TreeNode(4);
////        TreeNode node6 = new TreeNode(4);
//        TreeNode node9 = new TreeNode(7);
//        TreeNode node10 = new TreeNode(2);
//        TreeNode node11 = new TreeNode(1);
////        TreeNode node6 = new TreeNode(4);
////        TreeNode node13 = new TreeNode(9);
////        TreeNode node14 = new TreeNode(8);
//
//        root.left = node1;
//        root.right = node2;
//        node1.left = node3;
////        node1.right = node4;
//        node2.left = node5;
//        node2.right = node6;
//        node3.left = node9;
//        node3.right = node10;
////        node6.left = node13;
//        node6.right = node11;

        Solution solution = new Solution();
        System.out.println(solution.hasPathSum(root, 5));
    }
}

class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        boolean res = false;
        return hasPathSumHelper(root, sum, res);
    }

    private boolean hasPathSumHelper(TreeNode root, int target, boolean res) {
        if (root == null) {
            if (target == 0) return true;
            else return false;
        }
        if (root.left == null && root.right == null) {
            if (root.val != target) return false;
            else return true;
        } else {
            if (root.left != null) res = res || hasPathSumHelper(root.left, target - root.val, res);
            if (root.right != null) res = res || hasPathSumHelper(root.right, target - root.val, res);
            return res;
        }
    }
}