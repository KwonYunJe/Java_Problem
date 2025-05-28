
import java.util.Scanner;

public class Swea20019PalindromeOfPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        String[] answer = new String[t];

        for(int tc =0 ; tc < t ; tc++){
            String line = sc.nextLine();

            //문자열의 중간 지점
            int mid = (line.length() - 1) / 2;

            //중간지점을 기준으로 앞과 뒤를 나눈 문자열을 생성
            String head = line.substring(0, mid);
            String rear = line.substring(mid + 1);

            //회문인지 체크하는 메서드를 호출했을 때 모두가 참일 경우 YES를 저장
            if(CheckPalindrome(line) && CheckPalindrome(head) && CheckPalindrome(rear)){
                answer[tc] = "YES";
            }else{
                answer[tc] = "NO";
            }
        }

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println("#" + (i + 1) + " " + answer[i]);
        }

        sc.close();
    }

    //회문인지 체크하는 메서드
    static boolean CheckPalindrome(String str){
        for(int i = 0 ; i < str.length() / 2 ; i++){
            //앞에서 i번째 인덱스와, 뒤에서 i번째 인덱스를 비교했을 때 같지 않다면 즉시 거짓을 반환.
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        //모든 값이 일치하고 반복문이 끝나게 되면 참을 반환.
        return true;
    }
}
