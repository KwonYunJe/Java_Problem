import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Backjoon11005BaseTransformation2{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String answer = "";

        String[] line = br.readLine().split(" ");

        int num = Integer.parseInt(line[0]);
        int base = Integer.parseInt(line[1]);

        List<Integer> rest = new ArrayList<>();

        while(true){
            if(num < base){
                rest.add(num);
                break;
            }else{
                rest.add(num % base);
                num /= base;
            }
        }

        for(int i = rest.size() - 1 ; i >= 0 ; i--){
            if(rest.get(i) >= 10){
                //(char)변환하는 것 잊지 말기!
                answer += (char)(rest.get(i) - 10 + 'A');
            }else{
                answer += rest.get(i);
            }

        }

        bw.write(answer);
        bw.flush();
        bw.close();
    }
}
