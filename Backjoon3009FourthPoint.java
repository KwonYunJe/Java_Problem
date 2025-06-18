import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon3009FourthPoint {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] points = new int[3][2];

        for(int i = 0; i < 3 ; i++){
            String[] line = br.readLine().split(" ");
            int num1 = Integer.parseInt(line[0]);
            int num2 = Integer.parseInt(line[1]);
            points[i][0] = num1;
            points[i][1] = num2;
        }

        int x4, y4;

        // x좌표 중 한 번만 나오는 값 찾기
        if (points[0][0] == points[1][0]) x4 = points[2][0];
        else if (points[0][0] == points[2][0]) x4 = points[1][0];
        else x4 = points[0][0];

        // y좌표 중 한 번만 나오는 값 찾기
        if (points[0][1] == points[1][1]) y4 = points[2][1];
        else if (points[0][1] == points[2][1]) y4 = points[1][1];
        else y4 = points[0][1];

        bw.write(x4 + " " + y4 + "\n");
        bw.flush();
        bw.close();
        br.close();


    }
    

    
}
