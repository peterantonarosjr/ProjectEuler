public class solution{

    public static void main(String[] args){

        int totalNumbers = 10;

        int squares[] = new int[totalNumbers];
        int sum = 0;

        for(int i=0; i<totalNumbers; i++){

            squares[i] = (i+1)*(i+1);
            sum+=squares[i];
        }

        int squareSum = (totalNumbers*(totalNumbers+1))/2;
        squareSum*=squareSum;

        System.out.println(squareSum-sum);

    }

}
