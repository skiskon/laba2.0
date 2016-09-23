package Arrays;
import java.lang.*;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
        Random generator = new Random();
        int f=1;
        int max, index, j;
        int[] ar1 = new int[10];
        ar1[0]= generator.nextInt(10);
        System.out.println(ar1[0]);
        max = ar1[0];
        for(int i = 1; i<ar1.length; i++) {
            ar1[i] = generator.nextInt(10);
            if (ar1[i] > max) {
                f = 1;
                max = ar1[i];
            } else if (ar1[i] == max) f++;
            System.out.println(ar1[i]);
        }
        System.out.println("Кол-во максимальных элементов "+f);


        for(int i = 0; i<ar1.length; i++) {
           index = ar1[i];
            j=i;
            while ((j > 0) && (ar1[j-1]>index)) {
                ar1[j] = ar1[j-1];
                j--;
            }
            ar1[j]=index;
        }
        System.out.println("Отсортированный массив: ");
        for(int i = 0; i<ar1.length; i++) {
            System.out.println(ar1[i]);
        }
    }
}
