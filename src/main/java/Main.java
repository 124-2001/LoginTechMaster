import Account.LogicAccount;
import DataUser.LogicUser;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //Display Bài 1
        /* Scanner sc = new Scanner(System.in);
        LogicAccount lgAcc = new LogicAccount();
        while (true){
            System.out.println("*************************");
            System.out.println("*1)Thêm người dùng mới*");
            System.out.println("*2)Nạp Tiền*");
            System.out.println("*3)Thay đổi email người dùng*");
            System.out.println("*4)Hiển thị list người dùng*");
            System.out.println("*************************");
            System.out.print("Nhập chức năng : ");
            int n1 = sc.nextInt();
            while (n1>5||n1<0){
                System.out.print("Vui lòng nhập lại : ");
                n1 = sc.nextInt();
            }
            switch (n1){
                case 1:
                    lgAcc.AddAccount();
                    break;
                case 2:
                    System.out.print("Nhập mã người dùng : ");
                    int number = sc.nextInt();
                    lgAcc.Recharge(number);
                    break;
                case 3:
                    System.out.print("Nhập mã người dùng : ");
                    int number1 = sc.nextInt();
                    lgAcc.ChangeEmail(number1);
                    break;
                case 4:
                    lgAcc.DisplayInfo();
                    break;
            }
        }*/
        //Display Bài 2
        /*Scanner sc = new Scanner(System.in);
        LogicUser lgUser = new LogicUser();
        while (true) {
            System.out.println("*************************");
            System.out.println("*******TECH MASTER*******");
            System.out.println("********1. Login*********");
            System.out.println("********2. Sign Up*******");
            System.out.println("*************************");
            System.out.print("Vui lòng nhập lựa chọn : ");
            int n = sc.nextInt();
            while (n > 2 || n < 0) {
                System.out.print("Vui lòng nhập lại : ");
                n = sc.nextInt();
            }
            switch (n) {
                case 1:
                    lgUser.LoginAccount();
                    break;
                case 2:
                    lgUser.SignUpAccount();
                    break;
            }
        }*/
    }
}
