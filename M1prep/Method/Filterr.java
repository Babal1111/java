import java.util.ArrayList;
import java.util.Arrays;

public class Filterr {

    int[] filter(int[] data) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int n : data) {
            if (n > 0) {
                list.add(n);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    int[] filter(int[] data, String type) {

        ArrayList<Integer> list = new ArrayList<>();

        if (type.equals("EVEN")) {

            for (int n : data) {
                if (n % 2 == 0) {
                    list.add(n);
                }
            }

        } else if (type.equals("ODD")) {

            for (int n : data) {
                if (n % 2 != 0) {
                    list.add(n);
                }
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    int[] filter(int[] data, String type, int threshold) {

        ArrayList<Integer> list = new ArrayList<>();

        if (type.equals("EVEN")) {

            for (int n : data) {
                if (n % 2 == 0 && n > threshold) {
                    list.add(n);
                }
            }

        } else if (type.equals("ODD")) {

            for (int n : data) {
                if (n % 2 != 0 && n > threshold) {
                    list.add(n);
                }
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        Filterr f = new Filterr();

        int[] data = {12, -4, 7, 9, 0, 18, 3, -1};

        int[] result = f.filter(data, "ODD", 5);

        System.out.println("Filtered Result = " + Arrays.toString(result));
    }
}
