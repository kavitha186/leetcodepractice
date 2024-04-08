class Solution {
    public String mergeAlternately(String word1, String word2) {

      

        StringBuilder outputWord = new StringBuilder();
        int numberOfTimesToIterate = 0;
        int word1Length = word1.length();
        int word2Length = word2.length();
        if(word1Length <= word2Length) {
            numberOfTimesToIterate = word2.length();
        } else {
            numberOfTimesToIterate = word1.length();
        }

        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        for(int i=0; i<numberOfTimesToIterate; i++) {

            if(i < word1Length) {
                outputWord.append(word1Array[i]);
            } 

            if(i < word2Length) {
                outputWord.append(word2Array[i]);
            } 
            

        }

        return outputWord.toString();
        
    }

    public static void main(String args[]) {


        Solution sol = new Solution();
          String word1 = new Scanner(System.in).nextLine();
        String word2 = new Scanner(System.in).nextLine();

         System.out.println(sol.mergeAlternately(word1, word2));

    }
}
