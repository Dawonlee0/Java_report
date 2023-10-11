package _3_자료형연산자;

public class p67_array {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("화씨 온도를 입력하세요: ");
//        float fahrenheit = sc.nextFloat();
//        float celsius = ((float)5 / 9) * (fahrenheit - 32);
//        System.out.printf("화씨 %.1f도는 섭씨 %.1f도 입니다", fahrenheit, celsius);

        double[] ary1 = {1.1, 2.3, 4.7, 7.5};
        double[] ary2 = new double[4];
        ary2[0] = 1.1;
        ary2[1] = 2.3;
        ary2[2] = 4.7;
        ary2[3] = 7.5;

        System.out.println(ary1[0]);
        System.out.println("ary1 크기" + ary1.length);

        System.out.println(ary2[0]);
        System.out.println("ary2 크기" + ary2.length);

        System.out.printf("arr1[0] = %f, arr2[0] = %f\n", ary1[0], ary2[0]);

    }
}