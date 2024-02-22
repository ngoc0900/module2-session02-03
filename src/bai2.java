import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số phần tử(n) của mảng 1 chiều");
        int n = sc.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Mời nhập phần tử thứ " + i);
            array[i] = sc.nextDouble();
        }
        double tong = 0;
        for (int i = 0; i < array.length; i++) {
            tong += array[i];
        }
        System.out.println("Trung bình cộng các phần tử trong mảng là: "+(tong/n));
    }
}
