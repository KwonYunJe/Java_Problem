import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon2903CenterShiftAlgorithm {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int dotNum = (int) Math.pow((Math.pow(2, num) + 1) , 2);

        bw.write(String.valueOf(dotNum + "\n"));
        bw.flush();
        bw.close();
    }
}
