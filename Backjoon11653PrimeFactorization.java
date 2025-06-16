import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Backjoon11653PrimeFactorization {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        if (num == 1) {
            bw.flush();
            bw.close();
            return;
        }

        List<Integer> p = new ArrayList<>();

        int f = 2;

        while(num > 1){
            if(num % f == 0){
                p.add(f);
                num = num / f;
            }else{
                f++;
            }
        }

        p.sort(null);

        for(int i = 0 ; i < p.size(); i++){
            bw.write(String.valueOf(p.get(i)) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
