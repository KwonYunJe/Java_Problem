import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Backjoon2745BasTransformation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String num = st.nextToken();
        long base = Long.parseLong(st.nextToken());

        long answer = 0;
        //자릿수마다 곱해질 제곱 수
        long power = 1;

        for(int i = num.length() - 1 ; i >= 0 ; i--){
            char c = num.charAt(i);
            long value = 0;

            //i번째 요소가 숫자인지 확인
            if(Character.isDigit(c)){
                //숫자라면 '0'을 뺐을 때 int값과 동일해짐
                value = c - '0';
            }else{
                //문자라면 'A'를 빼고 10을 더해 문제의 의도에 맞춤
                //(문제는 숫자다음 바로 영문 대문자가 더해짐)
                value = c - 'A' + 10;
            }
            
            //정답 변수에 i번째 요소의 수치만큼 더함
            answer += value * power;
            //자릿수마다 곱해질 제곱수를 주어진 진법 수 만큼 곱함
            power *= base;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
