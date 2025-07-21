import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon2231Disassemble {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());

        int num = 1;

        int answer = 0;

        while (num < m) {
            int sum = 0;
            String str = ""+num;
            for(int i = 0 ; i < str.length() ; i++){
                sum += (int)str.charAt(i) - '0';
            }

            if(sum + num == m){
                answer = num;
                break;
            }else{
                num++;
            }
        }
        
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
