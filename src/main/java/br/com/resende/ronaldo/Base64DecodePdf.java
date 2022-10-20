package br.com.resende.ronaldo;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class Base64DecodePdf {

    public static void main(String[] args) {
        File file = new File("./test.pdf");

        try ( FileOutputStream fos = new FileOutputStream(file); ) {
            // To be short I use a corrupted PDF string, so make sure to use a valid one if you want to preview the PDF file
            String b64 = new String(Files.readAllBytes(Paths.get("teste.txt")));;
            byte[] decoder = Base64.getDecoder().decode(b64);

            fos.write(decoder);
            System.out.println("PDF File Saved");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
