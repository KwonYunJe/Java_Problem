import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon2720LaundryOwnerDonhyuk {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int tc = 0 ; tc < t ; tc++){
            int[] answer = new int[4];

            int num = Integer.parseInt(br.readLine());

            answer[0] = num / 25;
            num %= 25;
            answer[1] = num / 10;
            num %= 10;
            answer[2] = num / 5;
            num %= 5;
            answer[3] = num;

            String line = answer[0] + " " +answer[1] + " " +answer[2] + " " +answer[3] + " \n" ;

            bw.write(line);
            bw.flush();
        }

        bw.close();
    }
}
