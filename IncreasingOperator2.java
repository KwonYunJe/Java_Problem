package VsCode_Java.Java_Problem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IncreasingOperator2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int cycle = Integer.parseInt(sc.nextLine());
        List<Integer> answer = new ArrayList<>();

        for(int i = 0 ; i < cycle ; i++){
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int n = Integer.parseInt(sc.next());

            int aCount = 0;
            int bCount = 0;

            int num = a;

            while (num <= n) {
                num += b;
                aCount++;
            }

            System.out.println(aCount);

            num = b;

            while (num <= n) {
                num += a;
                bCount++;
            }

            System.out.println(aCount);

            answer.add(Math.min(aCount, bCount));
        }   

        for(int i = 0 ; i < answer.size() ; i++){
            System.out.println(answer.get(i) + "");
        }
    }
}
