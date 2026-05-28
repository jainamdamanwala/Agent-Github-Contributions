// Binary Tree Maximum Path Sum
// Difficulty: Hard
// URL: https://leetcode.com/problems/binary-tree-maximum-path-sum/

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    int max_sum;
    public int maxPathSum(TreeNode root) {
        max_sum = Integer.MIN_VALUE;
        maxGain(root);
        return max_sum;
    }
    private int maxGain(TreeNode node) {
        if (node == null) return 0;
        int left_gain = Math.max(maxGain(node.left), 0);
        int right_gain = Math.max(maxGain(node.right), 0);
        int price_newpath = node.val + left_gain + right_gain;
        max_sum = Math.max(max_sum, price_newpath);
        return node.val + Math.max(left_gain, right_gain);
    }
}