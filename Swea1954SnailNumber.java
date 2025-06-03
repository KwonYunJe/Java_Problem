
import java.util.Scanner;

public class Swea1954SnailNumber {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int n = sc.nextInt();
            int[][] map = new int[n][n];

            //방향이 순회하도록 배열 선언
            int[] dx = {0, 1, 0, -1}; //오른쪽, 아래, 왼쪽, 위
            int[] dy = {1, 0, -1, 0};
            int dir = 0; // 시작은 오른쪽 방향
            int x = 0;
            int y = 0;

            for (int num = 1; num <= n * n; num++) {
                map[x][y] = num;

                //다음 좌표
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                // 범위를 벗어나거나 이미 값이 있다면 방향 전환
                if (nx < 0 || ny < 0 || nx >= n || ny >= n || map[nx][ny] != 0) {
                    dir = (dir + 1) % 4;
                    nx = x + dx[dir];
                    ny = y + dy[dir];
                }

                x = nx;
                y = ny;
            }

            // 출력
            System.out.println("#" + tc);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
