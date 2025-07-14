import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon19532MathIsANonFaceToFaceLecture {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int c = Integer.parseInt(line[2]);
        int d = Integer.parseInt(line[3]);
        int e = Integer.parseInt(line[4]);
        int f = Integer.parseInt(line[5]);

        int denominator = a * e - b * d;

        int x = (c * e - b * f) / denominator;
        int y = (a * f - c * d) / denominator;

        bw.write(x + " " + y);
        bw.flush();
        bw.close();
    }
}

//크레머의 공식 활용해야 함.
//