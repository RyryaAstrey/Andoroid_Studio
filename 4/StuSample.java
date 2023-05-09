public class StuSample {
    public static void main(String[] args) {
        Student stu = new Student();

        // スーパークラスのメソッド
        stu.setName("辻森");
        stu.display();

        // サブクラスのメソッド
        stu.setStuNo(1);
        stu.displayStuNo();
    }
}
