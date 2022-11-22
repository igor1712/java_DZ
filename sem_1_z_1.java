
//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;


public class sem_1_z_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int sum_1 = 1;
        int sum_2 = 0;
        for (int index = 0; index < input+1; index++) {
            sum_2 += index;
        }
        System.out.println(sum_2);
        for (int index = 1; index < input+1; index++) {
            sum_1 *= index;
        }
        System.out.println(sum_1);
    }
}