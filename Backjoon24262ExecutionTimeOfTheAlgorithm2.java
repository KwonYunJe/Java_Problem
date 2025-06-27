//https://www.acmicpc.net/problem/24263

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon24262ExecutionTimeOfTheAlgorithm2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(num) + "\n");
        bw.write("1\n");
        bw.flush();
        bw.close();
    }
}
