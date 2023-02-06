package ex5_8;

public class Member {
    private String Id;
    private String Password;
    private String name;
    private int age;

    //멤버변수에대한 생성자 생성
    public Member(String id, String password, String name, int age) {
        Id = id;
        Password = password;
        this.name = name;
        this.age = age;
    }

    //각 멤버변수에 대한 getter setter 생성
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //해당 클래스에 대한 toString 오버라이딩
    @Override
    public String toString() {
        return "Member{" +
                "Id='" + Id + '\'' +
                ", Password='" + Password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                "}\n";
    }
}
