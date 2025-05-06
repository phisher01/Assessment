public class Problem7 {
    public static int compoundedInflation(int rate, int years) {
        double factor = Math.pow(1 + rate*0.01, years);//calculating inflation factor

        int compoundedPercentage = (int)Math.round(((factor - 1) * 100));//Inflation percentage
        return compoundedPercentage;
    }

    public static void main(String[] args) {
        int rate = 20; // 20% inflation
        int years = 5;
        
        int result = compoundedInflation(rate, years);
        System.out.println(result);
    
}

}
