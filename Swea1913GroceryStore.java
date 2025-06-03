
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Swea1913GroceryStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        int[][] answer = new int[t][];

        for(int tc = 0 ; tc < t ; tc++){
            //가격표 및 할인가격표 개수
            //int num = Integer.parseInt(sc.nextLine());

            //섞여서 인쇄된 가격표들 정리
            String[] line = sc.nextLine().split(" ");

            int[] tag = new int[line.length];

            for(int i = 0 ; i < tag.length ; i++){
                tag[i] = Integer.parseInt(line[i]);
            }

            //할인된 가격표인 것들만 담을 리스트
            List<Integer> saleTag = new ArrayList<>();

            for(int i = 0 ; i < tag.length ; i++){
                //I번째 숫자가 0이 아니고 3으로 나눠 떨어질 때
                if(tag[i] != 0 && tag[i] % 3 == 0 ){
                    //일반 가격표의 인덱스를 담을 변수
                    int justTagIndex = -1;

                    //i번째 가격표의 약 1.3배가 되는 값을 찾아 위 변수에 저장
                    for(int j = 0 ; j < tag.length ; j++){
                        if(tag[j] == tag[i]/3*4) justTagIndex = j;
                    }

                    //인덱스가 저장되었다면 i번째 가격표는 할인된 가격표이며
                    //해당 가격표를 리스트에 저장하고
                    //할인되지 않은 가격표를 중복 처리 방지를 위해 0으로 처리
                    if(justTagIndex != -1){
                        saleTag.add(tag[i]);
                        tag[justTagIndex] = 0;
                    }
                }
            }

            answer[tc] = new int[saleTag.size()];

            for(int i = 0 ; i < saleTag.size() ; i++){
                answer[tc][i] = saleTag.get(i).intValue();
            }

        }

        for(int i = 0 ; i < answer.length; i++){
            System.out.printf("#" + (i + 1) + " ");
            for(int j = 0 ; j < answer[i].length ; j++){
                System.out.printf(answer[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
