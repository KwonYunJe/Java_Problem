

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Backjoon1002Turret {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int tc = 0 ; tc < t ; tc++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            //1번 지점의 좌표값
            int x1 = Integer.parseInt(st1.nextToken());
            int y1 = Integer.parseInt(st1.nextToken());
            //1번 지점에서의 반지름 값
            int r1 = Integer.parseInt(st1.nextToken());
            //2번 지점의 좌표 값
            int x2 = Integer.parseInt(st1.nextToken());
            int y2 = Integer.parseInt(st1.nextToken());
            //2번 지점에서의 반지름 값
            int r2 = Integer.parseInt(st1.nextToken());

            //1번 지점과 2번 지점의 거리를 측정
            double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            //좌표의 x값, y값, 반지름 값이 모두 동일하면 모든 원주 위에 있을 수 있으므로 -1
            if (x1 == x2 && y1 == y2 && r1 == r2) {
                bw.write("-1\n");
            } else {
                //두 반지름의 합
                double sum = r1 + r2;
                //두 반지름의 차의 절대값
                double diff = Math.abs(r1 - r2);
                //반지름의 합보다 거리가 멀면 두 원은 떨어져 있으므로 교차점이 없음.
                if (dist > sum) {
                    bw.write("0\n");
                //반비름의 합과 거리가 동일하면 두 원은 한 점만 외접하고 있음.
                } else if (dist == sum) {
                    bw.write("1\n");
                //반지름의 합이 차의 절대값보다 크면 2점을 겹치고 있음.
                } else if (dist > diff) {
                    bw.write("2\n");
                //반지름의 합과 차의 절대값이 동일하면 한 점을 내접하고 있음.
                } else if (dist == diff) {
                    bw.write("1\n");
                //모두 만족하지 않는다면 원 안에서 다른 원이 인접하고 있지 않음.
                } else {
                    bw.write("0\n");
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
