import SupportingFiles.TreeNode;

public class Q687 {
    public int longestUnivaluePath(TreeNode root) {
        return root == null ? 0 : helper(root)[0] - 1;
    }

    public int[] helper(TreeNode root) {
        if (root == null) return new int[]{0, 0};
        int[] leftResult = helper(root.left), rightResult = helper(root.right);
        int maxSize = Math.max(leftResult[0], rightResult[0]);
        int leftMax = 1, rightMax = 1;
        if (root.left != null && root.left.val == root.val) {
            leftMax += leftResult[1];
        }
        if (root.right != null && root.right.val == root.val) {
            rightMax += rightResult[1];
        }
        return new int[]{Math.max(maxSize, leftMax + rightMax - 1), Math.max(leftMax, rightMax)};
    }
}
