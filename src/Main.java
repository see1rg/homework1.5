public class Main {
    public static void main(String[] args) {

        // task1() {
        int[] array = new int[]{1, 2, 3};
        float[] list = new float[]{1.57f, 7.654f, 9.986f};
        long[] example = {34556, 7474747, 900001, 333592};


        // task2()

        int i = 0;
        System.out.print(array[i]);
        for (i = 1; i < array.length; i++) {
            System.out.print(", " + array[i]);
        }

        i = 0;
        System.out.print("\n" + list[i]);
        for (i = 1; i < list.length; i++) {
            System.out.print(", " + list[i]);
        }

        i = 0;
        System.out.print("\n" + example[i]);
        for (i = 1; i < example.length; i++) {
            System.out.print(", " + example[i]);
        }

        // task3

        System.out.print("\n" + array[array.length - 1]);
        for (i = array.length - 2; i > -1; i--) {
            System.out.print(", " + array[i]);
        }

        System.out.print("\n" + list[list.length - 1]);
        for (i = list.length - 2; i > -1; i--) {
            System.out.print(", " + list[i]);
        }

        System.out.print("\n" + example[example.length - 1]);
        for (i = example.length - 2; i > -1; i--) {
            System.out.print(", " + example[i]);
        }

        // task4

        System.out.println();
        for (i = 0; i < array.length; i++) {
            if ((array[i]) % 2 != 0) {
                array[i] += 1;
            }
        }
        i = 0;
        System.out.print(array[i]);
        for (i = 1; i < array.length; i++) {
            System.out.print(", " + array[i]);
        }
    }
}