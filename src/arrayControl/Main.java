package arrayControl;

public class Main {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] number = {3, 6, 9, 58, 65, 3, 8, 45, 6, 8, 9, 45, 22, 36, 85, 48};
        int[] dublicate = new int[number.length];
        int startIndex = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {

                if (!(i == j) && (number[i] == number[j]) && (number[j] % 2 == 0)) {
                    if (!isFind(dublicate, number[i])) {
                        dublicate[startIndex++] = number[j];
                        break;
                    }

                }
            }
        }

        for (int value : dublicate) {
            if (value != 0) System.out.println(value);

        }


    }

}




