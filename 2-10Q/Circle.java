class Circle{
  public static void main(String[] args){
    int radius = Integer.parseInt(args[0]);
    double pi = 3.141592;
    double area;
    
    area = radius * radius * pi;
    
    //�����_��R�ʈȍ~��؂�̂�
    
    System.out.println("���a�F" + radius);
    System.out.println("�ʐρF" + area);
  }
}
