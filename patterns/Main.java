import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //for taking input size
        int size = sc.nextInt();
// declaring array
        int[] numbers = new int[size];
//for taking array element input
        for(int i=0;i<size;i++){
          numbers[i]=sc.nextInt();
        }
//for checking conditions
        if(size==0){
            System.out.println("0");
        }else if (size==1){
            System.out.println(numbers[0]);
        }else if (numbers[0]>numbers[1]) {
            System.out.println(numbers[0]);
        }else if( numbers[size-1]>numbers[size-2]) {
           System.out.println(numbers[size - 1]);
        }else{
            for (int i = 1; i<size ; i++) {

                if(numbers[i]>numbers[i-1] && numbers[i]>numbers[i+1]){
                    System.out.println(numbers[i]);
                }

            }
        }sc.close();
    }
}