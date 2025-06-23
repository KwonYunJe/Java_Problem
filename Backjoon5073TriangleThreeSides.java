import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Backjoon5073TriangleThreeSides {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
        
        while (true) {
            int[] sides = new int[3];
            String[] line = br.readLine().split(" ");

            sides[0] = Integer.parseInt(line[0]);
            sides[1] = Integer.parseInt(line[1]);
            sides[2] = Integer.parseInt(line[2]);
            
            if(sides[0]==0&&sides[1]==0&&sides[2]==0){
                break;
            }

            Arrays.sort(sides);
            
            if(sides[0] + sides[1] <= sides[2]){
                bw.write("Invalid\n");
            }else if(sides[0] == sides[1] && sides[0] == sides[2]){
                bw.write("Equilateral\n");
            }else if(sides[0] == sides[1] || sides[0] == sides[2] || sides[1] == sides[2]){
                bw.write("Isosceles\n");
            }else{
                bw.write("Scalene\n");
            }

            bw.flush();
        }   

        bw.close();
    }
}
