class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        //find the great number of candies in a array

        //Add extracandy to each element in an array and compare with greates number

        int maxNumber = candies[0];
        List<Boolean> cand = new ArrayList<>();
        
        for(int i=0; i< candies.length; i++) {
            if(maxNumber < candies[i]) {
                maxNumber = candies[i];
            }
           
            
        }

        for(int j=0; j < candies.length; j++) {
            if(candies[j] + extraCandies >= maxNumber) {
                cand.add(true);
            } else {
                cand.add(false);
            }
        }

        return cand;
        
    }

    public static void main(String args[]) {
        KidsWithCandies s = new KidsWithCandies();

        Scanner s1= new Scanner(System.in);

        int[] intArray = new int[100];

        for(int i=0; i<=100; i++) {
            if(s1.hasNextInt()) {
                intArray[i] = s1.nextInt();
            }
        }

       
        Scanner s2= new Scanner(System.in);

        int s2line = s2.nextInt();


        s.kidsWithCandies(intArray, s2line);


    }
}
