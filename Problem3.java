public class Problem3 {

    public static double getLarger(double n1, double n2){
        return n1>n2?n1:n2;
    }
    public static void main(String[] args) {
        System.out.println("The larger of two numbers is "+ getLarger(4.5,9.20));
        System.out.println("The larger of two numbers is "+getLarger(-4.50,2.3));
        
    }
    
}
