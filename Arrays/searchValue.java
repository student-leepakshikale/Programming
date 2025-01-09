//Searching for an element x in a matrix

import java.util.*;
public class searchValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int rows=sc.nextInt();
        int columns=sc.nextInt();
           
        int[][]numbers=new int[rows][columns];

//taking input
    
        for(int i=0;i<rows; i++){
            for(int j=0;j<columns;j++){
             
                numbers[i][j]=sc.nextInt();
            }
        }
            
        int x=sc.nextInt();
         for(int i=0;i<rows; i++){
             for(int j=0;j<columns;j++){

                 if(numbers[i][j]==x){
                     System.out.println("element found at"+ i+","+j );
                 }
             }
     }
}
}
