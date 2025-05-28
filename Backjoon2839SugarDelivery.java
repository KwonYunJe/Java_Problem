
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Backjoon2839SugarDelivery {
    //throws IOException 있어야 함.
    public static void main(String[] args) throws IOException {
        //버퍼리더
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //토크나이저
        StringTokenizer st = new StringTokenizer(bf.readLine());

        //입력받은 개수만큼 배열 생성
        int[] nums = new int[st.countTokens()];

        //카운터
        int count = 0;

        //입력받은 문자를 형변환해서 배열에 저장
        while (st.hasMoreTokens()) {
            nums[count] = Integer.parseInt(st.nextToken());
            count++;
        }
        int input = nums[0];
        //아래 반복문이 종료될때까지 조건을 만족하지 못하면 -1을 출력
        int result = -1;

        //5키로 봉지를 최대한 많이 사용했다는 가정으로 시작, 5키로 봉지를 하나씩 줄인다.
        for(int five = input / 5; five >= 0 ; five-- ){
            //5키로 봉지 * x 만큼 총량에서 뺀 값
            int remaining = input - five * 5;
            //그 값이 3으로 나누어 떨어지면 각 봉지 개수를 합해서 출력
            if(remaining % 3 == 0){
                int three = remaining / 3;
                result = five + three;
                break;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
