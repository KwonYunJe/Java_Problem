import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Backjoon2687RepresentativeVlue2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[5];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        int answer = Arrays.stream(arr).sum();
        answer = answer / 5;

        bw.write(String.valueOf(answer)+"\n");
        bw.write(String.valueOf(arr[2])+"\n");
        bw.flush();
        bw.close();
    }
}
