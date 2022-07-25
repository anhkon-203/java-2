/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi11_fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anhkon
 */
public class DemoFileIOStream {

    public static void main(String[] args) {
        String filename = "file_io.txt0";
        ghiFile(filename);
        docFile(filename);
    }

    public static void ghiFile(String filename) {
        String data = "Hello IT17323";
        File file = new File(filename);

        if (file.exists() == true) {
            System.out.println("File đã tồn tại");
        } else {
            System.out.println("File ko tồn tại");
        }
        try {
            FileOutputStream fos = new FileOutputStream(file);
            byte[] b = data.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("ok");
        } catch (FileNotFoundException e) {
            System.out.println("ko tìm thấy file");
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Lỗi luồng vào ra");
        }
    }

    public static void docFile(String filename) {
        File file = new File(filename);

        if (file.exists() == false) {
            System.out.println("File đã tồn tại");
            return;
        }

        try {
            FileInputStream fis = new FileInputStream(file);
            while (true) {
                int i = fis.read();
                if (i == -1) {
                    break;
                }
                char c = (char) i;
                System.out.print(c);
            }

            fis.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Không tìm thấy file");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Lỗi luồng vào ra");
            ex.printStackTrace();
        }

    }
}
