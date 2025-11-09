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
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return new ArrayList<>();
        }

        queue.add(root);
        boolean odd = true;

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            
            while(size-- > 0){
                TreeNode current = queue.poll();
                list.add(current.val);

                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
            }
            if(odd == true){
                odd = false;
            }

            else{
                Collections.reverse(list);
                odd = true;
            }
            ans.add(list);
              
        }
        return ans;
        
    }
}