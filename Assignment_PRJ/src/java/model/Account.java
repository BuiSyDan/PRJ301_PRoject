
package model;

public class Account {

    int id;
    String username;
    String password;
    String displayname;
    String email;
    String numberphone;
    String isAdmin;

    public Account() {
    }

    public Account(int id, String username, String password, String displayname, String email, String numberphone, String isAdmin) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.displayname = displayname;
        this.email = email;
        this.numberphone = numberphone;
        this.isAdmin = isAdmin;
    }   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumberphone() {
        return numberphone;
    }

    public void setNumberphone(String numberphone) {
        this.numberphone = numberphone;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", username=" + username + ", password=" + password + ", displayname=" + displayname + ", email=" + email + ", numberphone=" + numberphone + ", isAdmin=" + isAdmin + '}';
    }

}
