public class Problem10 {

    
    public static int secondLarge(int arr[]){
        int max2=Integer.MIN_VALUE;
        int max1=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }else if(arr[i]>max2){
                max2=arr[i];
            }
        }

        if (max2 == Integer.MIN_VALUE) {//if array contains all elements identical then second largest will no longer exists
            System.out.println("No second largest element found.");
            return -1; 
        }
        
        return max2;



    } 
    public static void main(String[] args) {
        int arr[]={3,1,7,10,0,4,2};
        int arr2[]={3,1,7,101,99,45,82,25,147};
        

        System.out.println(secondLarge(arr));
        System.out.println(secondLarge(arr2));
        
    }
}
