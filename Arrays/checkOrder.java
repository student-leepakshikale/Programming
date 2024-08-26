import java.util.*;

public class checkOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
       
        int size = sc.nextInt();
        
        // declaring array
            int[] numbers  = new int[size];

        //for taking array element input
            for(int i=0;i<size;i++){
              numbers[i]=sc.nextInt();
            }


            boolean isAscending = true;
            
            for(int i=0;i<size-1;i++){
                if(numbers[i]>numbers[i+1]){
                   isAscending = false;
                }
            }

            if(isAscending){
                System.out.println("array is sorted in ascending order");
            }else{
                System.out.println("array is not sorted in ascending order");
            }

            sc.close();
    }
}
