/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<>();
        if (root != null) {
            searchPaths(root, "", answer);
        }
        return answer;
    }

    private void searchPaths(TreeNode node, String path, List<String> answer) {
        if (node.left == null && node.right == null) {
            answer.add(path + node.val);
            return;
        }
        
         if (node.left != null) {
            searchPaths(node.left, path + node.val + "->", answer);
        }
        if (node.right != null) {
            searchPaths(node.right, path + node.val + "->", answer);
        }
    }
}
