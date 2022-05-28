public class homework {

    public static void main(String[] args) {

        // 1 задание
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] b = {1.57, 7.654, 9.986};
        int[] c = new int[4];
        c[0] = 27;
        c[1] = 32;
        c[2] = 78;
        c[3] = 54;
        // 2 задание
        System.out.println("2 задание");
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1) {
                System.out.print(a[i] + ", ");
            } else {
                System.out.print(a[i]);
            }
        }
        System.out.println();
        for (int h = 0; h < b.length; h++) {
            if (h < b.length - 1) {
                System.out.print(b[h] + ", ");
            } else {
                System.out.print(b[h]);
            }
        }
        System.out.println();
        for (int j = 0; j < c.length; j++) {
            if (j < c.length - 1) {
                System.out.print(c[j] + ", ");
            } else {
                System.out.print(c[j]);
            }
        }
        System.out.println();
        // 3 задание
        System.out.println("3 задание");

        for (int i = a.length - 1; i >= 0; i--) {
            if (i < a.length && i > 0) {
                System.out.print(a[i] + ", ");
            } else {
                System.out.print(a[i]);
            }
        }
        System.out.println();
        for (int h = b.length - 1; h >= 0; h--) {
            if (h < b.length && h > 0) {
                System.out.print(b[h] + ", ");
            } else {
                System.out.print(b[h]);
            }
        }
        System.out.println();
        for (int j = c.length - 1; j >= 0; j--) {
            if (j < c.length && j > 0) {
                System.out.print(c[j] + ", ");
            } else {
                System.out.print(c[j]);
            }
        }
        System.out.println();
        // 4 задание
        System.out.println("4 задание");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 !=0) {
                a[i] = a[i] + 1;
            }
            System.out.print(a[i] + " ");
        }
    }
}
