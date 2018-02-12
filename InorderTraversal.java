class BinaryTree {
    List<Integer> result = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.EMPTY_LIST;
        }
        
        if (root.left == null && root.right == null) {
            result.add(root.val);
            return result;
        }   
        
        inorderTraversal(root.left);
        result.add(root.val);
        inorderTraversal(root.right);
        return result;
    }
}
