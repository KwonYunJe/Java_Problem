import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon2292Honeycomb {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        //층
        int floor = 1;
        //증가할 범위
        int range = 1;
        while (range < num) {
            range += 6*floor;
            floor++;
        }

        bw.write(String.valueOf(floor));
        bw.flush();
        bw.close();
    }   
}
