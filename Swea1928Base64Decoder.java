
import java.util.Scanner;

public class Swea1928Base64Decoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        String codeTable = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        StringBuilder[] answer = new StringBuilder[t];

        for (int tc = 0; tc < t; tc++) {
            String code = sc.nextLine();
            answer[tc] = new StringBuilder();

            for (int i = 0; i < code.length(); i += 4) {
                int buffer = 0;
                int padding = 0;

                for (int j = 0; j < 4; j++) {
                    char ch = code.charAt(i + j);
                    if (ch == '=') {
                        buffer <<= 6;
                        padding++;
                    } else {
                        buffer <<= 6;
                        buffer |= codeTable.indexOf(ch);
                    }
                }

                // 24비트 buffer → 8비트씩 3개 추출
                for (int j = 16; j >= 0; j -= 8) {
                    if (padding * 8 < j + 8) { // 패딩으로 인한 무효 바이트 제외
                        answer[tc].append((char) ((buffer >> j) & 0xFF));
                    }
                }
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println("#" + (i + 1) + " " + answer[i].toString());
        }
        sc.close();
    }
}
