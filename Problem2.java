public class Problem2 {

    public static double  calculateGrossPrice(double netprice,double taxRate){


        
        double grossPrice=netprice/(1+taxRate); //calculating grossprice for each item
        return grossPrice;

    }

    public static void main(String[] args) {
        System.out.println( calculateGrossPrice(99.95,0.12));
        System.out.println( calculateGrossPrice(49999.00,0.28));
        System.out.println( calculateGrossPrice(720.00,0.05));
        System.out.println( calculateGrossPrice(45.00,0.00));
        
    }
    
}
