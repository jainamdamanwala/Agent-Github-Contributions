// Add One Row to Tree
// Difficulty: Medium
// URL: https://leetcode.com/problems/add-one-row-to-tree/

class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            return new TreeNode(val, root, null);
        }
        dfs(root, 1, depth);
        return root;
    }

    void dfs(TreeNode node, int curDepth, int targetDepth) {
        if (node == null) {
            return;
        }
        if (curDepth == targetDepth - 1) {
            node.left = new TreeNode(val, node.left, null);
            node.right = new TreeNode(val, null, node.right);
        }
        dfs(node.left, curDepth + 1, targetDepth);
        dfs(node.right, curDepth + 1, targetDepth);
    }
}