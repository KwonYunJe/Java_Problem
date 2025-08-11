//https://www.acmicpc.net/problem/10815

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Backjoon10815NumberCards {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 손패 개수
        int n = Integer.parseInt(br.readLine());

        // 손패 숫자들 -> Set
        Set<Integer> have = new HashSet<>(n);
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            have.add(Integer.parseInt(st.nextToken()));
        }

        // 체크리스트 개수
        int m = Integer.parseInt(br.readLine());

        // 체크리스트들 읽으면서 바로 출력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int q = Integer.parseInt(st.nextToken());
            bw.write((have.contains(q) ? "1" : "0") + " ");
        }

        bw.write("\n");
        bw.flush();
        bw.close();
        br.close();

    }
}
