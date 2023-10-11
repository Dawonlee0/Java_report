package _5_제어흐름;
import java.util.Scanner;

public class Homework3 {
    public static int[] findMinMax(int [] ary){
        int max = ary[0];
        int min = ary[0];


        for(int i = 0; i < ary.length; i++){
            //max
            if(ary[i] > max){
                max = ary[i];
            }
            //min
            if(ary[i] < min){
                min = ary[i];
            }
        }
        return new int[]{min, max};
    }

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 개의 정수를 입력할 예정인가요? ");
        int num = scanner.nextInt();
        int[] ary = new int[num];

        // 입력
        for (int i = 0; i < num; i++){
            System.out.print("수를 입력하세요");
            int a1 = scanner.nextInt();
            ary[i] = a1;

        }

        int[] minMax = findMinMax(ary);

        System.out.println("최대값: " + minMax[1]);
        System.out.println("최소값: " + minMax[0]);

    }
}
