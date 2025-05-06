public class Problem5 {
    
public static int incomeTax(int income){
    if(income<=250000){
        return 0;
    }else if(income>250000 && income<=500000){
        return (int)(0.1*(income-250000));
    }else if(income>500000 && income<=1000000){
        return(int)((0.1*250000)+(0.2*(income-500000)));
    }else{
       return (int)((0.1*250000)+(0.2*500000)+(0.3*(income-1000000)));
    }
}

    public static void main(String[] args) {
        System.out.println("tax:"+incomeTax(190000));
        System.out.println("tax:"+incomeTax(345000));
        System.out.println("tax:"+incomeTax(780000));
        System.out.println("tax:"+incomeTax(2400000));
        
    }
}
