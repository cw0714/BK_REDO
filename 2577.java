import java.util.Scanner;

import static java.lang.System.in;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int t = A * B * C;
        int result[] = new int[10]; //선언 범위는 0~9이다,,?

        while (t > 0) { //t>0일때 내부 코드 반복
            result[t % 10]++; //result[t%10]에 1을 더한다
            t /= 10;  //t나누기 10 값을 변수 t에 저장
        }
        for (int i = 0; i < result.length ; i++)
            System.out.println(result[i]);
    }
}
