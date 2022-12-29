package Homework4;

public class Homework4_Task1 {

    public static void main(String[] args) {
        public String simplifyPath (String path){
            Deque<String> deq = new LinkedList<>();
            String[] tokens = path.split("/");
            for (var token : tokens) {
                if ("..".equals(token)) {
                    if (!deq.isEmpty()) {
                        deq.pollLast();
                    }
                } else if (!"".equals(token) && !".".equals(token)) {
                    deq.addLast(token);
                }
            }
            if (deq.isEmpty()) {
                return "/";
            }

            StringBuilder ans = new StringBuilder();
            while (!deq.isEmpty()) {
                ans.append("/").append(deq.pollFirst());
            }

            return ans.toString();
        }

    }
}
