package file;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int alg, looptype, n;
        alg = Integer.parseInt(args[0]);
        looptype = Integer.parseInt(args[1]);
        n = Integer.parseInt(args[2]);
        if (alg == 1) {
            if (looptype == 1) {
                System.out.println(Arrays.toString(getFibonachiWhile(n)));
            }
            if (looptype == 2) {
                System.out.println(Arrays.toString(getFibonachido(n)));
            }
            if (looptype == 3) {
                System.out.println(Arrays.toString(getFibonachiFor(n)));
            }
        } else {
            if (looptype == 1) {
                System.out.println(getFacWhile(n));
            }
            if (looptype == 2) {
                System.out.println(getFacdo(n));
            }
            if (looptype == 3) {
                System.out.println(getFacFor(n));
            }

        }
    }

    public static int[] getFibonachiFor(Integer n) {
        int[] array = new int[n];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    public static int[] getFibonachiWhile(Integer n) {
        int[] array = new int[n];
        array[0] = 0;
        array[1] = 1;
        int i = 2;
        while (i < n) {
            array[i] = array[i - 1] + array[i - 2];
            i++;
        }
        return array;
    }

    public static int[] getFibonachido(Integer n) {
        int[] array = new int[n];
        array[0] = 0;
        array[1] = 1;
        int i = 2;
        do {
            array[i] = array[i - 1] + array[i - 2];
            i++;
        } while (i < n);
        return array;
    }

    public static int getFacWhile(Integer n) {
        int factorial = 1;
        while (n > 1) {
            factorial *= n;
            n -= 1;
        }
        return factorial;
    }

    public static int getFacFor(Integer n) {
        int factorial;
        for (factorial = 1; n > 1; n--) {
            factorial *= n;
        }
        return factorial;
    }

    public static int getFacdo(Integer n) {
        int factorial = 1;
        do {
            factorial *= n;
            n -= 1;
        } while (n > 1);
        return factorial;
    }
}







