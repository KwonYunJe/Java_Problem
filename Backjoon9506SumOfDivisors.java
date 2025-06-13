import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Backjoon9506SumOfDivisors {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //반복문임을 잊지않기
        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == -1) break;

            List<Integer> divisors = new ArrayList<>();

            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    divisors.add(i); // 자기 자신 제외한 약수만 저장(합할때 자기 자신은 제외됨.)
                }
            }

            int sum = divisors.stream().mapToInt(Integer::intValue).sum();

            if (sum == num) {
                bw.write(num + " = ");
                for (int i = 0; i < divisors.size(); i++) {
                    bw.write(String.valueOf(divisors.get(i)));
                    if (i < divisors.size() - 1) {
                        bw.write(" + ");
                    }
                }
                bw.write("\n");
            } else {
                bw.write(num + " is NOT perfect.\n");
            }
        }

        bw.flush();
        bw.close();
    }   
}
