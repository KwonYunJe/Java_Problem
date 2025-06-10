import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Backjoon2501FindingDivisors {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");

        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);

        List<Integer> divisors = new ArrayList<>();

        //틀린부분 : i * i < n 으로 했었음
        for(int i = 1 ; i * i <= n ; i++){
            if(n % i == 0){
                divisors.add(i);
                if(i != n / i){
                    divisors.add(n/i);
                }
            }
        }
        divisors.sort(null);
        
        //틀린 부분 : <= k 로 했었음
        if(divisors.size() < k){
            bw.write("0\n");
        }else{
            bw.write(String.valueOf(divisors.get(k - 1)) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
