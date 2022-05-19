public class solution{

    public static void main(String[] args){

        int current = 0;
        boolean flag = true;
        while(flag){
            current++;
            for(int i=1; i<=20; i++){

                if(current%i != 0){
                    break;
                }else if(i==20 && current%i==0){
                    flag = false;
                }
            }

        }
        System.out.println(current);

    }

}
