import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Backjoon18870CoordinateCompression {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];

        String[] line = br.readLine().split(" ");
        for(int i = 0 ; i < n ; i++){
            nums[i] = Integer.parseInt(line[i]);
        }

        //배열을 복사하고 정렬
        int[] sorted = Arrays.copyOf(nums, n);
        Arrays.sort(sorted);

        //정렬한 대로 탐색
        //map을 사용하며 key값을 입력된 값
        //value 값을 rank 변수를 사용한다.
        //rank변수는 새로운 값이 나오면 ++ 된다.
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(sorted[i])) {
                map.put(sorted[i], rank++);
            }
        }

        //원래 배열의 i 번째 원소를 map에서 찾고
        //map에서 찾은 원소의 value를 출력한다.
        for (int i = 0; i < n; i++) {
            bw.write(map.get(nums[i]) + " ");
        }

        bw.flush();
        bw.close();
        
    }
}
