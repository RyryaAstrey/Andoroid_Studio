import java.io.*; // IOExceptionはjava.ioの中に含まれているのでインポートしている

public class WriteFile {
    public void open() {
        System.out.println("ファイルを開きます");
    }
    public void write() throws IOException { // throwsを使うことによって、呼び出す側でtry-catchするかもしれないとできるのでコンパイルエラーにならない
        throw new IOException(); // 書き込みの際にIOExceptionが発生する
    }
    public void close() {
        System.out.println("ファイルを保存して閉じます");
    }
}
