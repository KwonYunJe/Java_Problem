import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Backjoon2750SortingNumbers {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] nums = new int[num];

        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length ; i++){
            bw.write(String.valueOf(nums[i])+"\n");
        }
        bw.flush();
        bw.close();
    }
}
