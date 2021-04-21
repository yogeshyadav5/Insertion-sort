// importing scanner for taking input from user
import java.util.Scanner;
public class InsertionSortExample {
    
     //making a function of name func 
    void func(){
        Scanner sc = new Scanner(System.in);
        
        //Initializing array with its size.
        int ar[] = new int[5];
        
        // from here there are 3 steps which are most important and aglorithm of the program.
        
        
        //step 1 input
        System.out.println("Enter the element : ");
        
        //taking the input from the user by using for loop to take more than 2 input
        for(int i=0;i<ar.length;i++){
            ar[i] = sc.nextInt();
        }
        
        //step 2
        //in this step we use the loop for sorting element 
        
        //loop for checking the value through 
        for(int i =0;i<ar.length;i++){
            for(int c=0; c<i;c++){
                
                 // if is used to swap the number here, "c+1" is used to comparing the elements of the column with next elements of column
                if(ar[c]>ar[i])
                {
                    //initializing the temporary element
                    int temp = ar[c];
                    ar[c] = ar[i];
                    ar[i]= temp;
                }
            }
        }
        //step 3
        
        //priting the SORTED data
         System.out.println("-----------------insertion sort---------");
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
        
    
     public static void main(String args[]){
         
         InsertionSortExample obj = new InsertionSortExample();
         obj.func();
     }
    
}
