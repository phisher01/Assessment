public class Problem1{



    public static int countDigits(int n){
        int count=0;
        n=Math.abs(n); // evaluating absolute val of integer n

        while(n>0){
            n=n/10;
            count++;

        }
        return count;
    }
    public static void main(String[] args) {
        
        System.out.println(countDigits(34));
        System.out.println(countDigits(-7291));
        System.out.println(countDigits(0));

    }
    
}