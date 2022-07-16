import java.util.Arrays;
import  java.util.Scanner;
public class day1 {
    public static void main (String [] args){
        boolean isTrue = true ;
        int [] arr = new int[2];
        int i =0, count=0,k;
        System.out.println("\n" +
                "give the sweep depth  \n" +
                "found from the sonar  \n"+
                "press 0 to terminate the inputs  \n");
        Scanner input = new Scanner(System.in);
        do {

            if (i == (arr.length)) {
                arr = incarraysize(i, arr);
            }

            arr[i] = input.nextInt();

            if(arr[i]==0){
                break;
            }
            i++;

        }while(input.hasNextLine());
          k=i;
        for(i=0;i<k;i++) {
            if(arr[i+1]>arr[i]){
                count ++;
            }
        }
        System.out.println(count);
    }
   public static int[] incarraysize(int k,int []arr) {

        int [] ar = Arrays.copyOf(arr ,(k+1));
        return ar;
    }
}
