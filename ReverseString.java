class ReverseString {
    public String reverseWords(String s) {

        

        StringBuilder strdd = new StringBuilder();

    
        String[] arrOfStr = s.trim().split(" ");


        for(int k=arrOfStr.length-1; k>=0; k--) {

            if(arrOfStr[k].length() > 0) {
                strdd.append(arrOfStr[k]);
                if(k!=0) {
                    strdd.append(" ");
                }
            }

            

        }

        return strdd.toString().trim();
    }


    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        String s1 = s.nextLine();

        ReverseString sol = new ReverseString();

        sol.reverseWords(s1);
    }
}
