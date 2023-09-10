import java.util.Scanner;


public class shortMearg {
 void merge1(int a[], int start, int mid, int end)
    {
        int l = mid-start+1; // number of elements
        int r = end - mid;
        int[] left_subarray = new int [l];  
        int []right_subarray = new int [r];

            for(int  i= 0; i<l; ++i )   
                left_subarray[i] = a[start +i];

            for(int j = 0; j<r; ++j)
                right_subarray [j] = a[mid+1+j];

                int i =0, j=0;

                int k = start;

                while(i<l && j<r){
                    if (left_subarray[i]<=right_subarray[j]){
                        a[k]= left_subarray[i];
                        i++;
                    }
                    else{
                        a[k]=right_subarray[j];
                        j++;
                    }
                    k++;
                }

                while (i<l) 
                {
                    a[k] = left_subarray[i];
                    i++;
                    k++;

                }
                while (j<r) 
                {
                    a[k] = right_subarray[j];
                    j++;
                    k++;
                }

             } 

                void mergesort(int a[], int start, int end)
                {
                    if (start<end) {
                        int mid =  (start+end)/2;
                        mergesort(a,start,mid);
                        mergesort (a, mid + 1, end);
                        merge1(a, start, mid, end);
                    
                    }
                }

    public static void main(String[] args) {

        int n,i,a[];
            Scanner  sc = new Scanner(System.in);

            System.out.println("How many elements do you want to enter");
                n=sc.nextInt();
                a = new int[n];
                System.out.println("Enter Elements");
                for(i=0;i<n;i++)
                {
                    a[i] = sc.nextInt();
                }

                shortMearg ob = new shortMearg();
                ob.mergesort(a, 0, n-1);

                for(i=  0; i<n; i++)
                System.out.print(a[i]);

               
    


        
    }
    
}
