//https://www.acmicpc.net/problem/14215

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BackjoonThreeBars {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 

        String[] line = br.readLine().split(" ");
        int[] length = new int[3];

        length[0] = Integer.parseInt(line[0]);
        length[1] = Integer.parseInt(line[1]);
        length[2] = Integer.parseInt(line[2]);

        Arrays.sort(length);

        if(length[2] >= length[1] + length[0]){
            bw.write(String.valueOf((length[0] + length[1]) * 2 - 1) + "\n");
        }else{
            bw.write(String.valueOf(Arrays.stream(length).sum()) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
