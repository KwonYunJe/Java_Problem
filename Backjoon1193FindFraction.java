import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon1193FindFraction {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int count = 2;
        int range = 1;

        while (range < num) {
            range += count;
            count++;
        }

        int min = range - num;
        int[] answer = new int[2];

        answer[0] = count - min;
        answer[1] = count - answer[0];
        if(count%2 != 0){
            int a = answer[0];
            answer[0] = answer[1];
            answer[1] = a;
        }

        String line = answer[0] + "/" + answer[1];
        bw.write(line);
        bw.flush();
        bw.close();
    }
}
