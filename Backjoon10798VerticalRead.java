
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon10798VerticalRead {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //정답을 담을 문자열
        String answer = ""; 

        //입력받은 문자들이 저장될 가변배열
        char[][] input = new char[5][];

        //가변배열 중 가장 긴 길이
        int maxLength = 0;

        //5줄이 주어지므로 5번 반복
        for(int i = 0 ; i < 5 ; i++){
            String inputLine = br.readLine();

            input[i] = inputLine.toCharArray();

            maxLength = Math.max(maxLength, inputLine.length());
        }
        //가로로 제일 긴 길이만큼 반복
        for(int i = 0 ; i < maxLength; i++){
            //입력받은 문자의 세로길이만큼 반복
            for(int j = 0 ; j < input.length ; j++){
                //만약 현재탐색중인 인덱스 번호가 현재 배열길이보다 작다면 인덱스의 요소를 찾아 위 리스트에 더함
                //인덱스 번호가 배열길이보다 길때 발생하는 오류 회피 목적
                if(i < input[j].length){
                    answer += input[j][i];
                }
            }
        }

        bw.write(answer);
        bw.flush();
        bw.close();
    }   
}
