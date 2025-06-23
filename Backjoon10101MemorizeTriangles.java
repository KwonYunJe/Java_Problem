import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Backjoon10101MemorizeTriangles {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] angles = new int[3];
        String answer = "";

        angles[0] = Integer.parseInt(br.readLine());
        angles[1] = Integer.parseInt(br.readLine());
        angles[2] = Integer.parseInt(br.readLine());

        if(Arrays.stream(angles).sum() != 180){
            answer = "Error";
            bw.write(answer);
            bw.flush();
            bw.close();
            return;
        }

        if(angles[0] == 60 && angles[1] == 60 && angles[2] == 60){
            answer = "Equilateral";
        }else if(angles[0] == angles[1] || angles[1] == angles[2] || angles[0]== angles[2]){
            answer = "Isosceles";
        }else{
            answer = "Scalene";
        }

        bw.write(answer);
        bw.flush();
        bw.close();
    }    
}
