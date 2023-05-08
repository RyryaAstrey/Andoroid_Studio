class StuSample5 {
    public static void main(String[] args) {
        Student5 stu1 = new Student5("辻森");
        stu1.setScore(80);
        stu1.display();

        Student5 stu2 = new Student5("村山");
        stu2.setScore(-50);
        // stu2.score = -50; // 変数scoreをprivate指定していないと、-50という不正な値を代入できてしまう。
        stu2.display();
    }
}
