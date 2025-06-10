import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Backjoon2869SanilWantRaise {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        double[] num = new double[3];

        int count = 0;

        while (st.hasMoreTokens()) {
            num[count] = Double.parseDouble(st.nextToken());
            count++;
        }

        int day = (int) Math.ceil((num[2] - num[1]) / (double)(num[0] - num[1]));

        bw.write(String.valueOf(day) + "\n");
        bw.flush();
        bw.close();
    }
}
