class Car3 {
  private int no;
  private int speed;

  public Car3() {
      no = 0;
  }

  public Car3(int n) {
      no = n;
  }

  void setNo(int n) {
    no = n;
  }

  void run(int s) {
    speed = s;
  }

  // brakeメソッドを定義する
  void brake() {
    no = 0;
  }

  void brake(int s) {
    speed = speed - s;
  }

  void display() {
    System.out.println("ナンバー" + no + "の速度は" + speed + "です");
  }
}