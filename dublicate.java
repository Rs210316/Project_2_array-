class DublicateElementsArray{

    public static void main (String [] arg){
        String  arr [] = {"java","Python","rohit","Ravi kant"};
        boolean flag=false;
        
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Found dublicate elements " + arr[i]);
                    flag=true;
                }
            }
        }


        if(flag == false ){

            System.out.println("dublicate value not found");
        }
    }
}