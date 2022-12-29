package Homework5;

public class Homework5_Task1 {

    public static void main(String[] args) {
        public int countWords (String[]words1, String[]words2){
            Set<String> usedOnceA = new HashSet<>();
            Set<String> usedMoreThanOnce = new HashSet<>();
            Set<String> usedOnceAandB = new HashSet<>();
            int n = words1.length;
            int p = words2.length;
            for (int i = 0; i < n; i++) {
                String w = words1[i];
                if (usedOnceA.contains(w)) {
                    usedOnceA.remove(w);
                    usedMoreThanOnce.add(w);
                }
                if (!usedMoreThanOnce.contains(w)) {
                    usedOnceA.add(w);
                }
            }
            for (int i = 0; i < p; i++) {
                String w = words2[i];
                if (usedOnceA.contains(w)) {
                    if (usedOnceAandB.contains(w)) {
                        usedOnceAandB.remove(w);
                        usedMoreThanOnce.add(w);
                    }
                    if (!usedMoreThanOnce.contains(w)) {
                        usedOnceAandB.add(w);
                    }
                }
            }
            return usedOnceAandB.size();
        }
    }

}

