package ex9;

public class Stuident1 {
    private String StudentName;
    private int KorScore;
    private int engScore;
    private int totalScore;

    //각 멤버변수에 대한 getter setter생성
    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getKorScore() {
        return KorScore;
    }

    public void setKorScore(int korScore) {
        KorScore = korScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    //모든 정보를 출력하는 toString 오버라이딩

    @Override
    public String toString() {
        return "Stuident1{" +
                "StudentName='" + StudentName + '\'' +
                ", KorScore=" + KorScore +
                ", engScore=" + engScore +
                ", totalScore=" + totalScore +
                '}';
    }
}
