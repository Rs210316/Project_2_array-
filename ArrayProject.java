import java.util.Arrays;
import java.util.Scanner;

public class ArrayProject {

    public static boolean isSubset(int[] arr1, int[] arr2) {
        // Convert arr2 to a sorted array to make searching faster
        Arrays.sort(arr2);
        
        for (int element : arr1) {
            if (Arrays.binarySearch(arr2, element) < 0) {
                // Element from arr1 is not found in arr2
                return false;
            }
        }
        return true;
    }

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

    static void QuickShort (int arr [],int low, int high) {

        int mid = (low+high)/2;
        int i = low;
        int j = high;
        int pivot = arr[mid];
        while(i<=j){
            while ( arr[i]<pivot){
                i++;
            }
            while (arr[j]>pivot) {
                j--;
                
            }
            if (i<=j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
                
            }
        }
        if(low<j)
            QuickShort(arr, low, j);
        if(high >i)
            QuickShort(arr, i, high);   
    }

    public static void main(String[] args) throws Exception {
        
    

        int arr[] = {15,25,11,14,1,12,3,5,6};

        System.out.println("QuickShort Array started");
        System.out.println("before Shorting ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
            }

            QuickShort(arr,0,arr.length-1);
            System.out.println();
            System.out.println("After Shorting");
            for(int i=0; i<arr.length;i++){
                System.out.print(arr[i]+" ");
            } System.out.println();
            System.out.println("QuickShort Array end");
            System.out.println();

        System.out.println("bubbleShort Array Started");

        int arrr[] = {15,25,11,14,1,12,3,5,6};

        System.out.println("before bubble short ");
        for(int i=0;i<arrr.length;i++){
            System.out.print(arrr[i]+" ");
        }
        System.out.println();
        int temp=0;
        for(int i=0;i<arrr.length;i++){
            for(int j=1; j<(arrr.length-i);j++){
                if(arrr[j-1]>arrr[j])
                {
                    temp = arrr[j-1];
                    arrr[j-1]=arrr[j];
                    arrr[j]=temp;
                }
            }
        }

        System.out.println("after Bubble short");
        for(int i= 0; i<arrr.length;i++){
            System.out.print(arrr[i]+" ");

        }System.out.println();
        System.out.println("bubbleShort Array end");
        System.out.println();

        System.out.println("Find Dublicate Started");

        int  ar [] = {15,25,11,14,1,1,12,3,5,6};
        boolean flag=false;
        
        for(int i=0; i<ar.length; i++)
        {
            for(int j=i+1; j<ar.length; j++)
            {
                if(ar[i]==ar[j])
                {
                    System.out.println("Found dublicate elements " + ar[i]);
                    flag=true;
                }
            }
        }


        if(flag == false ){

            System.out.println("dublicate value not found");
        }
        System.out.println("Find Dublicate end");
System.out.println();
            System.out.println("Selection Short Started");
      int aar[] = {15,25,11,14,1,12,3,5,6};
        for(int i=0; i<aar.length; i++){
            int smallest = i;
            for(int j=i+1; j<aar.length; j++){
                if (arr[smallest] > arr[j] ){
                smallest = j;
                    
                }
            }

            int tem = aar[smallest];
            arr[smallest] = aar[i];
            arr[i] = tem;

            System.out.print(arr[i]+" ");
            

        }System.out.println();System.out.println("Selection Short end");
        System.out.println();
System.out.println("ShortMearge Started");

        int n,i,a[];
            Scanner  sc = new Scanner(System.in);

            System.out.println("How many elements do you want to enter");
                n= sc.nextInt();
                a = new int[n];
                System.out.println("Enter Elements");
                for(i=0;i<n;i++)
                {
                    a[i] = sc.nextInt();
                }

                shortMearg ob = new shortMearg();
                ob.mergesort(a, 0, n-1);

                for(i=  0; i<n; i++)
                System.out.print(a[i]+" ");

                System.out.println();
                System.out.println("ShortMearge end");

                System.out.println();

               System.out.println("Subset Array Started");

               int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 4, 5};

        if (isSubset(arr1, arr2)) {
            System.out.println("arr1 is a subset of arr2");
        } else {
            System.out.println("arr1 is not a subset of arr2");
        }
        System.out.println("Subset Array end");


    }
    
}
