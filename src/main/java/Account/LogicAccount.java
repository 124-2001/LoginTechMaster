package Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogicAccount {
    List<Account> accounts = new ArrayList<>();
    public boolean CheckAccountNumberisExist(int accountNumber){
        for (Account account : accounts) {
            if(account.getAccountNumber()==accountNumber){
                return false;
            }
        }
        return true;
    }

    public boolean CheckAccountEmailisExist(String email){
        for (Account account : accounts) {
            if(account.getEmail().equalsIgnoreCase(email)){
                return false;
            }
        }
        return true;
    }
    public boolean CheckRegularExpressionEmail(String email){
        Pattern pattern = Pattern.compile("((\\w)*@gmail.com)");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public void AddAccount(){
        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        System.out.print("Nhập tên người dùng : ");
        String name =sc.nextLine();
        account.setName(name);
        System.out.print("Nhập mã người dùng : ");
        int accountNumber = sc.nextInt();
        while (!CheckAccountNumberisExist(accountNumber)){
            System.out.println("Mã người dùng tồn tại vui lòng nhập lại ! ");
            System.out.print("Nhập mã người dùng : ");
            accountNumber = sc.nextInt();
        }
        account.setAccountNumber(accountNumber);
        System.out.print("Nhập email (Ex:abc123@gmail.com) : ");
        String email = sc.nextLine();
        email = sc.nextLine();
        while (!CheckRegularExpressionEmail(email)){
            System.out.println("Nhập email không phù hợp vui lòng nhập lại ! ");
            System.out.print("Nhập email người dùng : ");
            email = sc.nextLine();
        }
        while (!CheckAccountEmailisExist(email)){
            System.out.println("Nhập email đã tồn tại vui lòng nhập lại ! ");
            System.out.print("Nhập email người dùng : ");
            email = sc.nextLine();
        }
        account.setEmail(email);
        account.setAccountBalance(0);
        accounts.add(account);
        System.out.println("Thêm thành công ! ");
    }

    public void Recharge(int accountNumber){
        Scanner sc = new Scanner(System.in);
        if(CheckAccountNumberisExist(accountNumber)){
            System.out.println("Không có người dùng phù hợp . ");
        }
        else {
            System.out.print("Nhập số tiền muốn nạp : ");
            double amount = sc.nextDouble();
            while (amount<0){
                System.out.print("Nhập lại số tiền muốn nạp : ");
                amount = sc.nextDouble();
            }
            for (Account account : accounts) {
                if(account.getAccountNumber()==accountNumber){
                    account.recharge(amount);
                    break;
                }
            }
            System.out.println("Nạp tiền thành công !");
        }
    }

    public void ChangeEmail(int accountNumber){
        Scanner sc = new Scanner(System.in);
        if(CheckAccountNumberisExist(accountNumber)){
            System.out.println("Không có người dùng trong danh sách ");
        }
        else {
            System.out.print("Nhập email mới (Ex:abc123@gmail.com) : ");
            String email = sc.nextLine();
            while (!CheckRegularExpressionEmail(email)){
                System.out.println("Nhập email không phù hợp vui lòng nhập lại ! ");
                System.out.print("Nhập email người dùng : ");
                email = sc.nextLine();
            }
            while (!CheckAccountEmailisExist(email)){
                System.out.println("Nhập email đã tồn tại vui lòng nhập lại ! ");
                System.out.print("Nhập email người dùng : ");
                email = sc.nextLine();
            }
            for (Account account : accounts) {
                if(account.getAccountNumber()==accountNumber){
                    account.changeEmail(email);
                    break;
                }
            }
            System.out.println("Thay đổi email thành công . ");
        }
    }

    public void DisplayInfo(){
        if(accounts.size()==0){
            System.out.println("Danh sách rỗng ");
        }
        else {
            for (Account account : accounts) {
                account.displayInfo();
            }
        }
    }

}
