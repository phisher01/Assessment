public class Problem4 {

    public static double findMedian(double arr[]){
        

        int n =arr.length;
        if(n==0){
            return -1.0;
        }
        if(n%2!=0){
            return  arr[n/2];
        }else{
            double mid1=arr[(n/2)-1];
            double mid2=arr[(n/2)];
            return (mid1+mid2)/2;
        }
    }
    public static void main(String[] args) {

        double arr[]={10.7};
        double  arr1[]={1.0,2.0,3.0};
        double arr2[]={17.4,21.1,39.7,48.0};
        double arr3[]={-957.0,-493.0,-384.0,-268.0,-131.0};
        System.out.println("Median :"+findMedian(arr));
        System.out.println("Median :"+findMedian(arr1));
        System.out.println("Median :"+findMedian(arr2));
        System.out.println("Median :"+findMedian(arr3));


        
    }
    
}
