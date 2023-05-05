// 値段が3000円以上の場合は値引きし、税込み金額を出力するプログラム

class Branch1 {
    public static void main(String[] args) {
        int price = Integer.parseInt(args[0]);
        double rate = 0.10; // 消費税率:10%
        int discount, amount;

        if (price >= 3000) { // 値引額の設定
            discount = 300;
        } else {
            discount = 0;
        }

        amount = (int) ((price - discount) * (1 + rate)); // 値引きした後税込み金額を求める。
        System.out.println("値引き金額:" + discount + "円");
        System.out.println("税込み金額:" + amount + "円");
    }
}
