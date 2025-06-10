import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon5086MultiplesAndDivisors {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String[] num = br.readLine().split(" ");
            int[] nums = new int[]{Integer.parseInt(num[0]), Integer.parseInt(num[1])};

            if(nums[0] == 0 && nums[1] == 0){
                break;
            }else if(nums[0] == 0 || nums[1] == 0){
                bw.write("neither\n");
            }else{
                if(nums[0] % nums[1] == 0){
                    bw.write("multiple\n");
                }else if(nums[1] % nums[0] == 0){
                    bw.write("factor\n");
                }else{
                    bw.write("neither\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
