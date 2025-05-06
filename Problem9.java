public class Problem9 {
    
    public static boolean isSpecial(int n){
        if(n < 10 || n > 99) { // non two digit n can not be special
            return false;
        }
        int n1=n/10;
        
        int n2=n%10;
        int num=n1+n2+(n1*n2);
       
    if(num==n){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSpecial(59));
        System.out.println(isSpecial(46));
        
    }
}
