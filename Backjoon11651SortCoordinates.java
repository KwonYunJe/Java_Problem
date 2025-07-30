import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Backjoon11651SortCoordinates {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());    
        int[][] cdn = new int[n][2];

        for(int i = 0 ; i < n ; i++){
            String[] line = br.readLine().split(" ");
            cdn[i][0] = Integer.parseInt(line[0]);
            cdn[i][1] = Integer.parseInt(line[1]);
        }

        Arrays.sort(cdn, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                return o1[1]!=o2[1] ? o1[1]-o2[1] : o1[0]-o2[0];
            }
        });

        for(int i = 0 ; i < n ; i++){
            bw.write(String.valueOf(cdn[i][0]) + " " + String.valueOf(cdn[i][1]) + "\n");
        }

        bw.flush();
        bw.close();
    }
}