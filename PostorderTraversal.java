class PostorderTraversal {
    List<Integer> result = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.EMPTY_LIST;
        }
        
        if (root.left == null && root.right == null) {
            result.add(root.val);
            return result;
        }   
        
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        result.add(root.val);
        
        return result;
    }
}
