package sortArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int gecici;
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz : ");
        int arraySize = input.nextInt();
        int[] numbers = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print(i + 1 + ". Elemanı giriniz : ");
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    gecici = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = gecici;
                }
            }
        }
        System.out.println("-----------------Dizinin küçükten büyüğe sıralanışı--------------------------");
        System.out.println(Arrays.toString(numbers));
        // Arrays.sort(numbers);


    }
}
