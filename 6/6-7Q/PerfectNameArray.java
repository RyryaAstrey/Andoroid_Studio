// より効率的なNameArrayのコード

public class PerfectNameArray {
    public static void main(String[] args) {
        String[] names = { "桜井", "田原", "中川", "鈴木" };
        String search = args[0];
        int i; // iを14行目でも使うためにmainブロック内で定義が必要

        for (i = 0; i < names.length; i++) {
            if (names[i].equals(search)) {
                break; // namesとsearchが一致した次点で処理終了
            }
        }
        if (i < names.length) { // iが配列数より少なければtrue
            System.out.println(search + "さんは含まれています");
        } else {
            System.out.println(search + "さんは含まれていません");
        }
    }
}
