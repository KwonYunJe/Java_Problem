import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon1018RepaintingChessboard {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        char[][] board = new char[Integer.parseInt(line[0])][Integer.parseInt(line[1])];
        //최소치를 구해야하므로 최대 값을 초기값으로 잡는다.
        int answer = 64;

        //입력값 정리
        for(int i = 0 ; i < board.length; i++){
            String boardLine = br.readLine();
            for(int j = 0 ; j < board[i].length ; j++){
                board[i][j] = boardLine.charAt(j);
            }
        }

        //보드 시작점 탐색
        for(int i = 0 ; i < board.length - 7; i++){
            for(int j = 0 ; j < board[0].length - 7; j++){

                //시작하는 색이 W인경우와 B인 경우 두 가지를 모두 상정한다.
                int countW = 0; // 'W'로 시작하는 경우
                int countB = 0; // 'B'로 시작하는 경우

                for(int x = 0 ; x < 8 ; x++){
                    for(int y = 0 ; y < 8 ; y++){
                        char current = board[i + x][j + y];
                        // 짝수 합 위치는 시작 색과 같아야 함
                        if((x + y) % 2 == 0){
                            if(current != 'W') countW++;
                            if(current != 'B') countB++;
                        }else{
                            if(current != 'B') countW++;
                            if(current != 'W') countB++;
                        }
                    }
                }

                int minCount = Math.min(countW, countB);
                answer = Math.min(answer, minCount);
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
