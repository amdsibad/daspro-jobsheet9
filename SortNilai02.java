import java.util.Arrays;

public class SortNilai02 {
    public static void main(String[] args) {

        int[] desc = {78, 65, 90, 55, 88, 72};
        for (int i = 0; i < desc.length - 1; i++) {
            for (int j = 0; j < desc.length - 1 - i; j++) {
                if (desc[j] < desc[j + 1]) {          // tanda dibalik: > menjadi <
                    int temp = desc[j];
                    desc[j] = desc[j + 1];
                    desc[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(desc));
    }
}
