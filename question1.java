import java.util.Arrays;

public class question1 {
    public static void main(String[] args) {
        int[] arrNum = {18, 10, 20, 17, 9, 7};

        int sum = 0;
        for (int i = 0; i < arrNum.length; i++) {
            sum += arrNum[i];
            arrNum[i] = sum;
        }

        System.out.println("Cumulative Sum of Array: " + Arrays.toString(arrNum));
    }
}