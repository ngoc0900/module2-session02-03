import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mời bạn nhập số thứ nhất");
        int a = sc.nextInt();
        System.out.println("Mời bạn nhập số thứ hai");
        int b = sc.nextInt();
        do {
            System.out.println("*****CACULATOR*****");
            System.out.println("1. Tổng 2 số");
            System.out.println("2. Hiệu 2 số");
            System.out.println("3. Tích 2 số");
            System.out.println("4. Thương 2 số");
            System.out.println("5. Số dư trong phép chia 2 số");
            System.out.println("6. Ước chung lớn nhất");
            System.out.println("7. Bội chung nhỏ nhất");
            System.out.println("8. Thoát");
            System.out.println("Lựa chọn của bạn");
            int chose = sc.nextInt();
            switch (chose) {
                case 1:
                    System.out.println("Tổng 2 số là: " + (a + b));
                    break;
                case 2:
                    System.out.println("Hiệu 2 số là: " + (a - b));
                    break;
                case 3:
                    System.out.println("Tích 2 số là: " + (a * b));
                    break;
                case 4:
                    System.out.println("Thương 2 số là: " + (a / b));
                    break;
                case 5:
                    System.out.println("Số dư trong phép chia 2 số là: " + (a % b));
                    break;
                case 6:
                    int ucln = 0;
                    if (a >= 0) {
                        for (int i = 1; i <= a; i++) {
                            if (a % i == 0 && b % i == 0) {
                                ucln = i;
                            }
                        }
                        System.out.print(" Ước chung lớn nhất là " + ucln);
                    } else {
                        for (int i = 1; i <= b; i++) {
                            if (a % i == 0 && b % i == 0) {
                                ucln = i;
                            }
                        }
                        System.out.print(" Ước chung lớn nhất là " + ucln);
                    }
                    break;
                case 7:
                    int uoc = 0;
                    if (a >= 0) {
                        for (int i = 1; i <= a; i++) {
                            if (a % i == 0 && b % i == 0) {
                                uoc = i;
                            }
                        }
                    } else {
                        for (int i = 1; i <= b; i++) {
                            if (a % i == 0 && b % i == 0) {
                                uoc = i;
                            }
                        }
                    }

                    System.out.println("Bội chung nhỏ nhất: " + (a * b)/uoc);
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập lại");
            }
        } while (true);

    }
}
