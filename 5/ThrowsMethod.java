import java.io.*;

public class ThrowsMethod {
    public static void main(String[] args) {
        WriteFile wf = new WriteFile(); // WriteFileはファイルに書き込みを行ったりするクラス
        try {
            wf.open(); // ファイルを開くと仮定するopenメソッド
            wf.write(); // ファイルに書き込みを行うと仮定るすwriteメソッド
        } catch(IOException e) {
            System.out.println("IOExceptionが発生しました");
            e.printStackTrace();
        } catch(Exception e) {
            System.out.println("Exceptionが発生しました");
            e.printStackTrace();
        } finally {
            wf.close(); // ファイルを保存すると仮定するcloseメソッド
        }
    }
}
