class BinaryTree {
    List<Integer> result = new ArrayList<Integer>();
        
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.EMPTY_LIST;
        }
        
        if (root.left == null && root.right == null) {
            result.add(root.val);
            return result;
        }   
        
        result.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return result;
    }
}
