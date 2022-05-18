import java.util.ArrayList;
public class solution{

    public static void main(String[] args){

        int targetFib =  10;
        ArrayList<Integer> fibList = new ArrayList<Integer>();

        fibList.add(0);
        fibList.add(1);
        fibList.add(2);

        for(int i=3; i<=targetFib; i++){

            int fibNum = fibList.get(i-1)+fibList.get(i-2);

            fibList.add(fibNum);
        }


        int fibSum = 0;
        for(int j=2; j<fibList.size(); j+=2){

            fibSum+=fibList.get(j);
        }

        System.out.println(fibSum);

    }

}
