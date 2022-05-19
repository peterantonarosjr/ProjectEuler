public class solution{

    public static void main(String[] args){

        int largestPal = 0;
        for(int i=0; i<=999; i++){

            for(int j=0; j<=999; j++){

                int product = i*j;
                if(isPalindrome(product)){
                    largestPal = product > largestPal ? product : largestPal;
                }
            }
        }

        System.out.println(largestPal);

    }


    public static boolean isPalindrome(int num){
        int n = num;
        int rev = 0;
        while(num>0){

            int digit = num%10;
            rev = rev*10+digit;
            num/=10;
        }
        return n==rev;
    }

}
