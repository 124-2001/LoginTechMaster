package DataUser;

import Account.IAccount;

public class User {
    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void displayInfo() {
        System.out.println("**********************");
        System.out.println("Tên đăng nhập : "+username);
        System.out.println("Mật khẩu : "+password);
        System.out.println("**********************");
    }
}
