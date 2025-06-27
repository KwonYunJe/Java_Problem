//https://www.acmicpc.net/problem/24264

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon24262ExecutionTimeOfTheAlgorithm3 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long num = Long.parseLong(br.readLine());

        bw.write(String.valueOf(num * num) + "\n");
        bw.write("2\n");
        bw.flush();
        bw.close();
    }
}
