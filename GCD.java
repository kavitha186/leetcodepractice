class GCD {
    public String gcdOfStrings(String str1, String str2) {


        String str = str1.concat(str2);
        int gcd=0;
        if(!(str1.concat(str2).equals(str2.concat(str1)))) {
            return "";
        } 

        return str.substring(0,  gcd(str1.length(), str2.length()));

       


    }
    
    //a=6 b=4
    //a=4 b = 2
    //a=2, b=0
    //a=2

    public int gcd(int a, int b) {
        return b==0? a: gcd( b, a%b);

    }


    public static void main(String args[]) {
        GCD s = new GCD();

        s.gcdOfStrings("ABCABC", "ABC");
    }

   
}
