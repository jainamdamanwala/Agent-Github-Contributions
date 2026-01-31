# Add One Row to Tree
# Difficulty: Medium
# URL: https://leetcode.com/problems/add-one-row-to-tree/

class Solution:
    def addOneRow(self, root: TreeNode, val: int, depth: int) -> TreeNode:
        if depth == 1:
            return TreeNode(val, root, None)
        self.dfs(root, 1, depth, val)
        return root

    def dfs(self, node, cur_depth, target_depth, val):
        if not node:
            return
        if cur_depth == target_depth - 1:
            node.left = TreeNode(val, node.left, None)
            node.right = TreeNode(val, None, node.right)
        self.dfs(node.left, cur_depth + 1, target_depth, val)
        self.dfs(node.right, cur_depth + 1, target_depth, val)