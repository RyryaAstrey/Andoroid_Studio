class Cast {
    public static void main(String[] args) {
        int price = Integer.parseInt(args[0]);
        double rate = 0.08;
        int amount;

        amount = (int)(price * (1 + rate)); // 税込み金額は小数を含んでしまう（2138.4などになる）可能性がある。それを切り捨てるためにint型に変換する。
        System.out.println("税込み金額：" + amount + "円");
    }
}
