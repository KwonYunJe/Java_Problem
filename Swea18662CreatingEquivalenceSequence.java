import java.util.Scanner;

public class Swea18662CreatingEquivalenceSequence {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		float[] answer = new float[t];
		
		for(int tc = 0; tc < t ; tc++) {
			String[] line = sc.nextLine().split(" ");
			float[] nums = new float[line.length];
			
			for(int i = 0 ; i < nums.length ; i++) {
				nums[i] = Integer.parseInt(line[i]);
			}
			//첫 인덱스와 마지막 인덱스를 더하고 2로 나누어 중간 값을 찾음.
            //중간값과 가운데 인덱스의 차이를 저장. (실수여야하므로 float 형)
			answer[tc] = Math.abs((nums[2]+nums[0]) / 2 - nums[1]);
			
		}
		
		for(int i = 0 ; i < answer.length; i++) {
            //소수점 아래 한자리까지 표현해야 함.
			String printString = String.format("%.1f", answer[i]);
			System.out.println("#" + (i+1) + " " + printString);
		}
		
		sc.close();
	}
}
