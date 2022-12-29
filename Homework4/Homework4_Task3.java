package Homework4;

public class Homework4_Task3 {

    public static void main(String[] args) {

        public boolean isSymmetric (TreeNode root){
            Stack<TreeNode> stack = new Stack<>();
            stack.add(root);
            stack.add(root);
            while (!stack.isEmpty()) {
                TreeNode l = stack.pop();
                TreeNode r = stack.pop();
                if (l == null && r == null) {
                    continue;
                }

                if (l == null || r == null) return false;

                if (l.val != r.val) return false;

                stack.push(l.left);
                stack.push(r.right);

                stack.push(l.right);
                stack.push(r.left);
            }
            return true;
        }
    }
}
