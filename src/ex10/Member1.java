package ex10;

public class Member1 {
    private String id;
    private String name;
    private String pw;

    public Member1(String id, String name, String pw) {
        this.id = id;
        this.name = name;
        this.pw = pw;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "Member1 {" +
                " 아이디 : " + id + '\'' +
                ", 이름 : " + name + '\'' +
                ", 비밀번호 : " + pw + '\'' +
                '}';
    }
}
