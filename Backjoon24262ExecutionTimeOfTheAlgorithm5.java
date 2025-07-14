import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon24262ExecutionTimeOfTheAlgorithm5 {
    public static void main(String[] args) throws Exception{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long num = Long.parseLong(br.readLine());

        long cycle = num*num*num;

        bw.write(String.valueOf(cycle) + "\n");
        bw.write("3\n");
        bw.flush();
        bw.close();
    }
}
