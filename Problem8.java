public class Problem8 {
    
    public static void convertSeconds(long totalSeconds) {
    
        long days = totalSeconds / (24 * 3600);
        totalSeconds = totalSeconds%(24 * 3600);

        long hours = totalSeconds / 3600;
        totalSeconds = totalSeconds%3600;

        long minutes = totalSeconds / 60;
        long seconds = totalSeconds % 60;

        System.out.println(days + " Day(s) " + hours + " Hour(s) " + minutes + " Minute(s) " + seconds + " Second(s)");
    }

    public static void main(String[] args) {
       convertSeconds(21893872);
        
    }
}
