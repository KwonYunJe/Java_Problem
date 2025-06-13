import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Backjoon1978DecimalFind {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;

        for(int i = 0 ; i < n ; i++){
            int num = Integer.parseInt(st.nextToken());

            if(isPrime(num)){
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

    private static boolean isPrime(int num){
        //주어진 수가 1이면 소수가 아니므로 false 반환
        if(num < 2){
            return false;

        //
        }else{
            for(int i = 2; i * i <= num; i++){
                if(num % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
