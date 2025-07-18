import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon1436DirectorShom {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int num = 1;
        int count = 0;
        while(count != n){
            if(String.valueOf(num).contains("666")){
                count++;
            }
            //마지막 숫자일 때는 가산이 되면 안되므로 조건문
            if(count != n) num++;
        }

        bw.write(String.valueOf(num));
        bw.flush();
        bw.close();
    }
}
