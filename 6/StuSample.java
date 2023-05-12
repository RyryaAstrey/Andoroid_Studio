public class StuSample {
    public static void main(String[] args) {
        Student stu1 = new Student("辻森");
        Student stu2 = new Student("辻森");

        boolean result = stu1.equals(stu2);
        System.out.println(result);
        System.out.println(stu1); // 「stu1」は自動的に「stu1.toString()」として扱われている。
    }
}
