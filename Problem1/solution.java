public class solution{

    public static void main(String[] args){

        int targetNumber = 10;
        int multSum = 0;

        for(int i=0; i<targetNumber; i++){

            if(i%3 == 0 || i%5 ==0){

                multSum+=i;
            }
        }

        System.out.println(multSum);
    }

}
