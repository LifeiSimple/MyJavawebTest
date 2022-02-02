package socket.transferfile;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Cilent {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8080)) {
            //  传输文件
            FileInputStream fileInputStream = new FileInputStream("src/main/java/socket/transferfile/file.txt");
            OutputStream stream = socket.getOutputStream();
            byte[] bytes = new byte[1024];
            int i;
            while ((i = fileInputStream.read(bytes)) != -1) {
                stream.write(bytes, 0, i);
            }
            fileInputStream.close();
            stream.flush();
            stream.close();
        } catch (IOException e) {
            System.out.println("服务端连接失败！");
            e.printStackTrace();
        }
    }
}
