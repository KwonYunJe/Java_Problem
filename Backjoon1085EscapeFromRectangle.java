import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Backjoon1085EscapeFromRectangle {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nums = new int[4];

        StringTokenizer st = new StringTokenizer(br.readLine());

        int c = 0;
        while(st.hasMoreTokens()){
            nums[c] = Integer.parseInt(st.nextToken());
            c++;
        }

        int h = Math.min(Math.abs(nums[0] - nums[2]), nums[0]) ;
        int v = Math.min(Math.abs(nums[1] - nums[3]), nums[1]) ;

        bw.write(String.valueOf(Math.min(h, v)));
        bw.flush();
        bw.close();
    }
}
