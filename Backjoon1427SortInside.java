import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Backjoon1427SortInside {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        int[] arr = new int[n.length()];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = n.charAt(i) - '0';
        }

        Arrays.sort(arr);

        for(int i = arr.length - 1 ; i >= 0 ; i--){
            bw.write(String.valueOf(arr[i]));
        }
        bw.flush();
        bw.close();
    }
}
