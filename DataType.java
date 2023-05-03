class DataType {
    public static void main(String[] args) {
        int month = 12;
        int day = 29;
        float weight = 63.0f; // float型はデータの後ろに「f」をつける必要がある。
        double height = 168.5;
        char bloodType = 'A'; // 一文字のデータ型は「'（シングルクォーテーション）」で囲む必要がある。

        String name = "辻森";

        System.out.println("こんにちは！" + name + "です。");
        System.out.println("身長は" + height + "cm、体重は" + weight + "kg、");
        System.out.println("誕生日は" + month + "月" + day + "日、");
        System.out.println("血液型は" + bloodType + "型です。");
        System.out.println("よろしくお願いします！");
    }
}
