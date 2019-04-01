package com.codingbat.array1.start1;

public class Start1 {

    public static void main(String[] args) {
        System.out.println(start1(new int[] {1, 2, 3}, new int[] {1, 3}));
        System.out.println(start1(new int[] {7, 2, 3}, new int[] {1}));
        System.out.println(start1(new int[] {1, 2}, new int[] {}));
    }

    // TODO improve
    private static int start1(int[] a, int[] b) {
        int count = 0;

        if (null != a && a.length != 0) {
            if (a[0] == 1) {
                count = count + 1;
            }
        }

        if (null != b && b.length != 0) {
            if (b[0] == 1) {
                count = count + 1;
            }
        }

        return count;
    }
}
