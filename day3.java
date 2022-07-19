import javax.annotation.processing.SupportedSourceVersion;
import java.util.Arrays;
import java.util.Scanner;
public class day3 {
    public static void main (String [] args){
        String []bin=new String[2] ;
        String [] gamma=new String[12];
        String [] epsilon=new String[12];
        int i=0;
        double g,e;
        Scanner input = new Scanner(System.in);

        do{
            if (i == (bin.length)){
                bin = incarraysize(i,bin);
            }
            bin[i] = input.nextLine();
            i++;
        }while (input.hasNextLine());

        gamma=findgamma(i,bin,gamma);
        epsilon=findepsilon(gamma,epsilon);

        g=bintodec(gamma);
        e=bintodec(epsilon);

        System.out.print("Gamma rate : ");
        for (int u=0;u<12;u++){
            System.out.print(gamma[u]);
        }
        System.out.print(" "+g+"\nEpsilon rate : ");
        for (int u=0;u<12;u++){
            System.out.print(epsilon[u]);
        }
        System.out.print(" "+e+" \n the power consumption of the submarine is : "+g*e+" ");
    }
    public static String[] incarraysize(int k,String []arr) {

        String [] ar = Arrays.copyOf(arr ,(k+1));
        return ar;
    }
    public static String [] findgamma(int i,String arr[],String gamm[]){
        int zeros,ones;
        for(int k=0;k<12;k++){
            zeros=0;
            ones=0;
            for (int j=0;j<i;j++) {
                String op=arr[j];
                char o = op.charAt(k);

                switch (o){
                    case'0':
                        zeros++;
                        break;
                    case'1':
                        ones++;
                        break;
                }
            }
            if(zeros>ones){
                gamm[k]="0";
            }else{
                gamm[k]="1";
            }
        }
        return gamm;
    }
    public static String [] findepsilon(String [] gamma,String [] epsilon){
        for(int j=0;j<12;j++){
            if(gamma[j]=="1")
                epsilon[j]="0";
            else
                epsilon[j]="1";
        }
        return epsilon;
    }
    public static double bintodec(String [] arr){
        double dec=0;
        for (int j=0;j<12;j++){
            if (arr[j]=="1"){
                dec=dec+Math.pow(2,11-j);
            System.out.println(" * bike sto: "+j+" "+dec);
            }
        }
        System.out.println(" ");
        return dec;
    }
}
