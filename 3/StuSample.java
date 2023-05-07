class StuSample {
    public static void main(String[] args) {
        // 設計図クラス「Student」を呼び出している
        Student stu1 = new Student();

        stu1.name = "辻森";
        stu1.setScore(90, 80);

        stu1.display();
        System.out.println("平均" + stu1.getAvg() + "点");
    }
}
