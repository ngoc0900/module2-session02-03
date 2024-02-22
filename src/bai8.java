import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 1 số nguyên");
        int num = sc.nextInt();
        do {
            System.out.println("*****CACULATOR*****");
            System.out.println("1. In dãy số chia hết cho 2 và giảm dần (n >= số >= 2)");
            System.out.println("2. In các số nhỏ hơn n và tính tổng");
            System.out.println("3. In ra các ước số chẵn của n");
            System.out.println("4. In ra các ước số lẻ và số lượng các ước lẻ của n");
            System.out.println("5. In ra ước số lẻ lớn nhất của n");
            System.out.println("6. Thoát");
            System.out.println("Lựa chọn của bạn");
            int chose = sc.nextInt();
            switch (chose) {
                case 1:
                    if (num > 1) {
                        for (int i = num; i >= 0; i--) {
                            if (i % 2 == 0) {
                                System.out.println("dãy số chia hết cho 2 và giảm dần là: " + i);
                            }
                        }
                    }
                    break;
                case 2:
                    int tong = 0;
                    for (int i = 0; i < num; i++) {
                        tong += i;
                    }
                    System.out.printf("các số nhỏ hơn  %d  và tổng là %d", num, tong);
                case 3:
                    for (int i = 1; i < num; i++) {
                        if (num % i == 0) {
                            if (i % 2 == 0) {
                                System.out.println("các ước số chẵn của " + num + " là " + i);
                            }
                        }
                    }
                    break;
                case 4:
                    int sum = 0;
                    for (int i = 1; i < num; i++) {
                        if (num % i == 0) {
                            if (i % 2 != 0) {
                                sum += 1;
                                System.out.println("các ước lẻ là "+i);
                            }
                        }
                    }
                    System.out.println("các ước số lẻ của " + num+ " và số lượng các ước lẻ là "+sum);
                    break;
                case 5:
                    int umax = 0;
                    for (int i = 1; i < num; i++) {
                        if (num % i == 0) {
                            if (i % 2 != 0) {
                                umax = i;
                            }
                        }
                    }
                    System.out.println("ước số lẻ lớn nhất của "+num+" là "+umax);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("chọn lại");
            }
        } while (true);

    }
}
