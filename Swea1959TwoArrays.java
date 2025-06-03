
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Swea1959TwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        List<Integer> answer = new ArrayList<>();

        //테스트케이스만큼 실행
        for(int tc = 0; tc < t ; tc++){
            //각 배열의 길이 입력받기
            int aSize = sc.nextInt();
            int bSize = sc.nextInt();
            sc.nextLine();

            //배열 입력받기
            String[] aInput = sc.nextLine().split(" ");
            String[] bInput = sc.nextLine().split(" ");

            //더 길이가 짧은 배열을 a 긴 배열을 b로 변경
            if(aSize > bSize){
                String[] ab = bInput;
                bInput = aInput;
                aInput = ab;
            }

            //String을 int로 형변환 하여 배열에 정리
            int[] a = new int[aInput.length];
            int[] b = new int[bInput.length];

            for(int i = 0 ; i< aInput.length ; i++) {
                a[i] = Integer.parseInt(aInput[i]);
            }

            for(int i = 0 ; i< bInput.length ; i++) {
                b[i] = Integer.parseInt(bInput[i]);
            }

            //상황별 결과를 담을 리스트 생성
            List<Integer> result = new ArrayList<>();

            //짧은 배열의 0번째 배열을 긴배열 0번째 배열부터 한개씩 뒤로 옮겨가며 총 합을 구함
            //그리고 그 값을 result에 저장
            for(int i = 0 ; i <= b.length - a.length; i++){
                int sum = 0 ;
                for(int j = 0 ; j < a.length ; j++){
                    sum += a[j] * b[i+j];
                }
                result.add(sum);
            }

            //상황별 결과 값을 내림차순 정렬
            Collections.sort(result, Collections.reverseOrder());

            //가장 큰 결과 값을 정답 배열에 저장
            answer.add(result.get(0));
        }

        for(int i = 0 ; i < answer.size() ; i++){
            System.out.println("#" + (i+1) + " " + answer.get(i));
        }
        sc.close();
    }
}
