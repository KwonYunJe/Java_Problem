import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon2581Decimal {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int min = 0;
        int sum = 0;

        for(int i = m ; i <= n ; i++){
            if(IsDecimal(i)){
                if(min == 0){
                    min = i;
                }
                sum += i;
            }
        }

        if(min == 0 && sum == 0){
            bw.write("-1");
        }else{
            bw.write(String.valueOf(sum) + "\n" + String.valueOf(min) + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static boolean IsDecimal(int num){
        if(num == 1){
            return false;
        }

        for(int i = 2 ; i * i<=num ; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}
