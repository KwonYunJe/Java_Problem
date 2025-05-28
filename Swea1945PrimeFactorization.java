
import java.util.Scanner;

public class Swea1945PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        String[] answer = new String[t];

        for(int tc = 0 ; tc < t ; tc++){
            int num = sc.nextInt();

            int[] count = new int[5]; 

            while(num > 1 ){
                if(num % 11 == 0){
                    num = num / 11;
                    count[4]++;
                }else if(num % 7 == 0){
                    num = num / 7;
                    count[3]++;
                }else if(num % 5 == 0){
                    num = num / 5;
                    count[2]++;
                }else if(num % 3 == 0){
                    num = num / 3;
                    count[1]++;
                }else if(num % 2 == 0){
                    num = num / 2;
                    count[0]++;
                }
            }

            answer[tc] = " " + count[0] + " " +  count[1] + " " +  count[2] + " " +  count[3] + " " +  count[4]; 
        }

        for(int i = 0 ; i < t ; i++){
            System.out.println("#" + (i+1) + answer[i]);
        }
    }
}
