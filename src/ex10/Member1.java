package ex10;

public class Member1 {
    private String name;
    private String id;
    private String pw;

    public Member1(){

    }

    public Member1(String name, String id, String pw) {
        this.name = name;
        this.id = id;
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
        return getName() +
                "의 정보는 아래와 같습니다.\n" +
                " 회원이름 : " + name + "\n" +
                " 아이디 : " + id + "\n" +
                " 비밀번호 : " + pw + "\n";
    }
}
