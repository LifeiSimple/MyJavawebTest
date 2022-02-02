package socket.transferdata;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8080);
             Scanner scanner = new Scanner(System.in)) {

            // 客户端给服务端发送数据
            System.out.println("已连接到服务端！");
            OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
            writer.write(scanner.nextLine()+"\n");
            writer.flush();
            System.out.println("数据已发送！等待服务端的确认...");

            // 客户端接收服务端发送的数据
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("收到服务端响应："+reader.readLine());

        } catch (IOException e) {
            System.out.println("服务端连接失败！");
            e.printStackTrace();
        }
    }
}
