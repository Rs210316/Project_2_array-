class Bubble {

    public static void main(String[] args) {

        int  arr[] = {10,13,1,14,53,15};
        System.out.println("before bubble short ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=1; j<(arr.length-i);j++){
                if(arr[j-1]>arr[j])
                {
                    temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("after Bubble short");
        for(int i= 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
