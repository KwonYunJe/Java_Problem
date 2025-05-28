import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Backjoon2563ColorPaper {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        int[][] spotArr = new int[t][2]; 

        for(int tc = 0 ; tc < t ; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            spotArr[tc][0] = Integer.parseInt(st.nextToken());
            spotArr[tc][1] = Integer.parseInt(st.nextToken());
        }

        int[][] pannel = new int[100][100];

        for(int i = 0 ; i < spotArr.length; i++){
            for(int y = spotArr[i][1] ; y < spotArr[i][1] + 10; y++){
                for(int x = spotArr[i][0] ; x < spotArr[i][0] + 10 ; x++){
                    pannel[y][x]++; 
                }
            }
        }

        int answer = 0;

        for(int i = 0 ; i < 100; i++){
            for(int j = 0 ; j < 100 ; j++){
                if(pannel[i][j] != 0){
                    answer++;
                }
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}