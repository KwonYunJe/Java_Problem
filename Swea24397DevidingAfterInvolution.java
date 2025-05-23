package VsCode_Java.Java_Problem;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Swea24397DevidingAfterInvolution {

    public static BigDecimal bigDecimalPow(BigDecimal base, long exponent, MathContext mc) {
        BigDecimal result = BigDecimal.ONE;
        while (exponent > 0) {
            if ((exponent & 1) == 1) result = result.multiply(base, mc);
            base = base.multiply(base, mc);
            exponent >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();

        String[] answer = new String[t];

        for(int tc = 0 ; tc < t ; tc++){
            String[] line = sc.nextLine().split(" ");
            BigDecimal base = new BigDecimal(line[0]);
            long y = Long.parseLong(line[1]);
            BigDecimal divisor = new BigDecimal(line[2]);

            if (divisor.compareTo(BigDecimal.ZERO) == 0) {
                answer[tc] = "division by zero";
                continue;
            }

            MathContext mc = new MathContext(100); // 적절한 정밀도
            BigDecimal pow = bigDecimalPow(base, y, mc);
            BigDecimal result = pow.divide(divisor, 30, RoundingMode.DOWN);

            String str = result.toPlainString();
            int dotIndex = str.indexOf(".");

            String returnStr = "";

            if(dotIndex == -1){
                returnStr = "000.000";
            } else {
                String integerPart = str.substring(0, dotIndex);
                String decimalPart = str.substring(dotIndex + 1);

                // 정수부 자르기
                if(integerPart.length() >= 3){
                    integerPart = integerPart.substring(integerPart.length() - 3);
                } else {
                    while (integerPart.length() < 3) {
                        integerPart = "0" + integerPart;
                    }
                }

                // 소수부 자르기
                if(decimalPart.length() >= 3){
                    decimalPart = decimalPart.substring(0, 3);
                } else {
                    while (decimalPart.length() < 3) {
                        decimalPart += "0";
                    }
                }

                returnStr = integerPart + "." + decimalPart;
            }

            answer[tc] = returnStr;
        }

        for(String s : answer){
            System.out.println(s);
        }

        sc.close();
    }
}
