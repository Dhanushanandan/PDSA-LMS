package lms;

public class User {

    private String uid;
    private String name;
    private String pass;
    private String address;
    private int mobile;
    private String email;
    private String Type;

    public User(String i, String n, String p, String a, int m, String e, String t) {
        this.uid = i;
        this.name = n;
        this.pass = p;
        this.address = a;
        this.mobile = m;
        this.email = e;
        this.Type = t;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

}
