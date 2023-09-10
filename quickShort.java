public class quickShort {

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
    public static void main(String[] args) {

        int arr[] = {15,25,11,14,1,12,3,5,6};
        System.out.println("before Shorting ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
            }

            QuickShort(arr,0,arr.length-1);
            System.out.println();
            System.out.println("After Shorting");
            for(int i=0; i<arr.length;i++){
                System.out.print(arr[i]+" ");

            
        }


        
    }
    
}
