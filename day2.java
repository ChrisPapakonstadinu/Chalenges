import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import  java.util.Scanner;
public class day2 {
    public static void main(String[] args) {

        int i = 0,horizontal=0,depth=0,val;
        String[] pos = new String[2];
        Scanner input = new Scanner(System.in);
        System.out.println("Give the planned course \n" +
                "End input with Ctrl+D \n");

        do {

            if (i == (pos.length)) {
                pos = incarraysize(i, pos);
            }
            pos[i] = input.next();
            i++;
        } while (input.hasNext());

        System.out.println("Size of Array : "+pos.length);

       for (i = 0; i <=pos.length-1; i+=2) {
            String p=pos[i];
            char o=p.charAt(0);
            switch(o){
                case'f':
                    val= Integer.parseInt(pos[i+1]);
                    horizontal +=val;
                    break;
                case'u':
                    val= Integer.parseInt(pos[i+1]);
                    depth -=val;
                    break;
                case'd':
                    val= Integer.parseInt(pos[i+1]);
                    depth +=val;
                    break;
            }
        }

        System.out.println("horizontal:" + horizontal + " depth:" + depth+" \n" +
                "the answer you looking for is :"+(horizontal*depth)+" ");
    }

    public static String[] incarraysize(int k, String[] pos) {

        String[] ar = Arrays.copyOf(pos, (k + 1));
        return ar;
    }
}
