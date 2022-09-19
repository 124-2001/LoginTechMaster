package DataUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogicUser {

    List<User> users = new ArrayList<>();

    public boolean CheckUserName(String userName){
        for (User user : users) {
            if(user.getUsername().equalsIgnoreCase(userName))
                return true;
        }
        return false;
    }
    public boolean CheckPassword(String passWord){
        for (User user : users) {
            if(user.getPassword().equalsIgnoreCase(passWord))
                return true;
        }
        return false;
    }
    public void LoginAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên đăng nhập : ");
        String userName = sc.nextLine();
        System.out.print("Mật khẩu : ");
        String passWord = sc.nextLine();
        if (!CheckUserName(userName)||!CheckPassword(passWord)){
            System.out.println("Login Failed");
        }
        if(CheckUserName(userName)&&CheckPassword(passWord)){
            System.out.println("Login Success");
            System.out.println("Danh sách những người đã đăng kí là : ");
            for (User user : users) {
                user.displayInfo();
            }
        }
    }
    public void SignUpAccount(){
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.print("Nhập tên đăng nhập : ");
        String userName = sc.nextLine();
        while (CheckUserName(userName)){
            System.out.println("Tên người dùng đã tồn tại , vui lòng nhập lại : ");
            userName=sc.nextLine();
        }
        user.setUsername(userName);
        System.out.print("Nhập mật khẩu : ");
        String passWord = sc.nextLine();
        user.setPassword(passWord);
        users.add(user);
        System.out.println("Sign Up Success");
    }
}
