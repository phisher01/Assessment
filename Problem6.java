public class Problem6 {

public static String mostVowels(String arr[]){
    int max=0;
    int maxcount=0;
    for(int i=0;i<=arr.length-1;i++){
        int count=0;


        for(int j=0;j<=arr[i].length()-1;j++){
            char ch=arr[i].charAt(j);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){

                count++;
            }
        }
       if(maxcount<count){
        maxcount=count;
        max=i;
       }

        
    }
    return arr[max];


}
    public static void main(String[] args) {
        String arr[]={"Sunshine","Umbrella","Major","Resourceful"};
        System.out.println(mostVowels(arr));
        
    }
    
}
