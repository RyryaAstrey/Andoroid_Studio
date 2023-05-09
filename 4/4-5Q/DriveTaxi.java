class DriveTaxi{
  public static void main(String[] args){
    Car c = new Car(); // Car()
    System.out.println("-----"); // 区切り線
    Taxi t1 = new Taxi(2525); // Car(int no)とTaxi(int no)
    System.out.println("-----"); // 区切り線
    Taxi t0 = new Taxi(); // Car(int no)とTaxi(int no)とTaxi()
    System.out.println("-----"); // 区切り線
    Taxi t2 = new Taxi("2525"); // Car()とTaxi(String no)
    // ※Car()が表示されるのは、メソッド「Taxi(String no)でsuperの記述が先頭にないため、自動的にsuper();が実行されるため。
  }
}
