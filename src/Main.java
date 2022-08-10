public class Main {
    public static void main(String[] args) {

        // task1() {
        int[] array = new int[]{1, 2, 3};
        float[] list = new float[]{1.57f, 7.654f, 9.986f};
        long[] example = {34556, 7474747, 900001, 333592};


        // task2()


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]);
            if (i < list.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = 0; i < example.length; i++) {
            System.out.print(example[i]);
            if (i < example.length - 1) {
                System.out.print(", ");
            }
        }

        // task3

        System.out.println();
        for (int i = array.length - 1; i > -1; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = list.length - 1; i > -1; i--) {
            System.out.print(list[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = example.length - 1; i > -1; i--) {
            System.out.print(example[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        // task4

        for (int i = 0; i < array.length; i++) {
            if ((array[i]) % 2 != 0) {
                array[i] += 1;
            }
        }

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }
}