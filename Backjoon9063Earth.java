import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Backjoon9063Earth {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int lines = Integer.parseInt(br.readLine());

        //0번째 배열은 x
        //1번째 배열은 Y
        int[][] balls = new int[2][lines];

        for(int i = 0 ; i < lines ; i++){
            String[] line = br.readLine().split(" ");
            balls[0][i] = Integer.parseInt(line[0]);
            balls[1][i] = Integer.parseInt(line[1]);
        }

        int v = Math.abs( Arrays.stream(balls[0]).max().getAsInt() - Arrays.stream(balls[0]).min().getAsInt() );
        int h = Math.abs( Arrays.stream(balls[1]).max().getAsInt() - Arrays.stream(balls[1]).min().getAsInt() );

        bw.write(String.valueOf(v*h + "\n"));
        bw.flush();
        bw.close();
    }
}
