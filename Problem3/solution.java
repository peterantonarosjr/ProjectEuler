import java.lang.Math;
public class solution{

    public static void main(String[] args){

        int targetNum = 13195;
        int largestPrime = 0;

        while(targetNum%2==0){

            targetNum/=2;
        }

        for(int i=3; i<=Math.sqrt(targetNum); i+=2){

            while(targetNum%i==0){

                largestPrime = i>largestPrime ? i : largestPrime;

                targetNum/=i;
            }
        }

        if(targetNum > 2){
            largestPrime = targetNum;
            System.out.println(largestPrime);
        }

    }

}
