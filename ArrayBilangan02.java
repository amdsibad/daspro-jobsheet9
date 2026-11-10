import java.util.Arrays;

public class ArrayBilangan02 {
    public static void main(String[] args) {

        int[] bil = new int[4];
        bil[0] = 5;
        bil[1] = 13;
        bil[2] = -7;
        bil[3] = 17;

        System.out.println("for loop:");
        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        System.out.println("foreach loop:");
        for (int nilai : bil) {
            System.out.println(nilai);
        }
        
        System.out.println("perbandingan:");
        System.out.println(Arrays.toString(bil));

    }
}
