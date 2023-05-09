class Taxi extends Car{
  Taxi(){
    this(9999);
    System.out.println("Taxi()");
  }
  Taxi(int no){
    super(no);
    System.out.println("Taxi(int no)");
  }
  Taxi(String no){
    // superの記述がないため、ここに「super();」が自動的に入る。
    System.out.println("Taxi(String no)");
  }
}
