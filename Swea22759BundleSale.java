
import java.util.Scanner;

public class Swea22759BundleSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        String[] answer = new String[t];

        for(int tc = 0 ; tc < t ; tc++){
            String[] line = sc.nextLine().split(" ");
            int[] range = new int[2];
            range[0] = Integer.parseInt(line[0]);
            range[1] = Integer.parseInt(line[1]);

            //range[0] < (range[1] + 1) / 2.0 는 사려는 물건의 '단품개수'가 '묶음상품의 단품개수' 의 절반 이상인지 판단
            //X % N 의 값(묶음만큼 제외한 나머지)은 항상 0~(N-1) 사이에 존재함, 그리고 그 값이 (N+1) / 2.0 보다 작으면 그냥 단품을 사게 됨.
            //즉 구매할 물건은 주어진 범위의 최소,
            //묶음이 개수는 범위의 최대로 지정하여 계산하면 반복문을 사용할 필요가 없음.
            //range[1] + 1을 하는 이유는 int 가 소수점 아래 자리를 버리기 때문에 올림을 하기 위함
            if(range[0] < (range[1] + 1) / 2.0){
                answer[tc] = "no";
            }else{
                answer[tc] = "yes";
            }
        }

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println(answer[i]);
        }
        sc.close();
    }
}
