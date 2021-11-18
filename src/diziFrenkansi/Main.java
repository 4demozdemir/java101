package diziFrenkansi;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] records = {};

        System.out.print("Dizi : " + Arrays.toString(list));
        System.out.println("\nTekrar Sayıları");
        for(int i = 0; i < list.length; i++) {
            boolean isContinue = false;
            for(int r : records) {
                if(r == list[i]) {
                    isContinue = true;
                    break;
                }
            }
            if(isContinue) {
                continue;
            }

            int count = 0;
            for(int j = 0; j < list.length; j++) {
                boolean isInclude = records.length > 0 && records[records.length - 1] == list[i];
                if(list[i] == list[j] && i <= j && !isInclude) {
                    int newIndex = records.length;
                    records = Arrays.copyOf(records, newIndex + 1);
                    records[newIndex] = list[i];
                    count++;
                }
            }

            System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
        }
    }
}
