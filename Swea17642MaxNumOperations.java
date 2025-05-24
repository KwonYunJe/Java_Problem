import java.util.Scanner;

public class Swea17642MaxNumOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        long[] answer = new long[T];

        for (int tc = 0; tc < T; tc++) {
            String[] input = sc.nextLine().split(" ");
            long A = Long.parseLong(input[0]);
            long B = Long.parseLong(input[1]);
            answer[tc] = maxOper(A, B);
        }

        for (int i = 0; i < T; i++) {
            System.out.println("#" + (i + 1) + " " + answer[i]);
        }

        sc.close();
    }

    public static long maxOper(long A0, long B0) {
        //A와 B가 같으면 0번 의 조작
        if (A0 == B0) {
            return 0;
        //A가 더 크면 둘을 같게 할 수 없다.
        //!! 중요 !! A는 +만 가능 B는 -만 가능하기 때문
        } else if (A0 > B0) {
            return -1;
        }

        long diff = B0 - A0;

        //B에서 A를 뺐을 때 1이 남으면 소수로 맞출 수 없음.
        if (diff == 1) {
            return -1;
        //B에서 A를 뺀 값이 2로 나누어 떨어진다면 그 수만큼 조작해서 둘을 맞출 수 있음
        } else if (diff % 2 == 0) {
            return diff / 2;
        //위 조건을 만족하지 않는다면 1을 뺀 뒤 2로 나눈 수만큼 반환
        } else {
            return (diff - 1) / 2;
        }
    }
}
