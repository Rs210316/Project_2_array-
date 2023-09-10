import java.util.*;

public class subsectarrey {
public static void main(String[] args) {
        int [] ar = {10,20,30,40,50,60,70,90};

        System.out.println("Write the number");

        Scanner scan = new Scanner (System.in);
        int key = scan.nextInt();

        int low = 0;
        int high = ar.length-1;
        while(low<=high){
            int mid = low+high/2;
            if(key==ar[mid]){
                System.out.println("key "+"found at index "+mid);
                break;


            }
            else if (key<ar[mid]){
                high=mid-1;

            }
            else if (key>ar[mid]){
                low=mid+1;

            }
            
        }

       if(low>high){
            System.out.println("Key not found");
        }
    }
    
}
