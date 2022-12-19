import java.nio.file.attribute.FileTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int[] number = new int[]{1, 2, 3};
        double[] weight = {1.57, 7.654, 9.986};
        int[] box = {20, 41, 60};
    }

    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        int[] number = new int[]{1, 2, 3};
        double[] weight = {1.57, 7.654, 9.986};
        int[] box = {20, 41, 60};
        for (int i = 0; i < number.length - 1; i++) {
            System.out.print(number[i] + ", ");
        }
        System.out.print(number[number.length - 1]);
        System.out.println();
        for (int i = 0; i < weight.length - 1; i++) {
            System.out.print(weight[i] + ", ");
        }
        System.out.print(weight[weight.length - 1]);
        System.out.println();
        for (int i = 0; i < box.length - 1; i++) {
            System.out.print(box[i] + ", ");
        }
        System.out.print(box[box.length - 1]);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        int[] number = new int[]{1, 2, 3};
        double[] weight = {1.57, 7.654, 9.986};
        int[] box = {20, 41, 60};
        for (int i = number.length-1; i > 0; i--) {
            System.out.print(number[i] + ", ");
        }
        System.out.print(number[0]);
        System.out.println();
        for (int i = weight.length-1; i > 0; i--) {
            System.out.print(weight[i] + ", ");
        }
        System.out.print(weight[0]);
        System.out.println();
        for (int i = box.length-1; i > 0; i--) {
            System.out.print(box[i] + ", ");
        }
        System.out.print(box[0]);
        System.out.println();
    }


    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        int [] number = new int [] {1, 2, 3};
        for (int i=0; i<number.length; i++) {
            if (number[i] % 2 != 0) {
                number[i] = number[i] + 1;
            }
        }
        System.out.println(Arrays.toString(number));
    }
}