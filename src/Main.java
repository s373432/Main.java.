
import java.util.Random;
import static java.lang.Math.*;

class first {
    public static void main(String[] args) {
        short [] a = new short [20];
        for(int i = 0; i < 20; i++){
            a[i] = (short) (20 - i);
        }
        float[] x = new float[16];
        double[][] ar = new double[20][16];
        Random r = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = (r.nextFloat(-13, 15));
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 16; j++) {
                double xx = x[j];
                if (a[i] == 16) {
                    ar[i][j] = cos(pow(cos(xx), 0.333));
                }
                if (a[i] == 1 ||  a[i] == 3 || a[i] == 4 || a[i] == 6 || a[i] == 8 || a[i] == 9 || a[i] == 11 || a[i] == 17 || a[i] == 18 || a[i] == 19) {
                    ar[i][j] = pow(cos(pow(0.5*(xx - 1),2)), 2 * (0.75 / (xx - 0.5)));
                } else {
                    ar[i][j] = log10((abs(xx) + 1) / abs(xx)) * (0.333 + atan(pow(E, pow(-pow(cos(xx), 2), 2))));
                }
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 16; j++) {
                System.out.printf("%.2f", ar[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
