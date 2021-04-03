package br.com.abc.Javacore.IO.teste;

import java.io.*;

public class BufferedTeste {
    public static void main(String[] args) {
        File file = new File("file.txt");
        // Try comum com Buffered Writer e Buffered Reader
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Transcrevendo uma nova mensagen no arquivo.");
            bw.newLine(); // Encontra o \n
            bw.write("E pulando uma linha");
            bw.flush();
            bw.close();

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s = null;
            while((s = br.readLine()) != null) {
                // Acima, transformamos a string S uma variável para guardar o valor de br.readLine() dentro do condicionamento do loop
                System.out.println(s);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Try with resources com Buffered Writer e Buffered Reader
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file));
             BufferedReader br = new BufferedReader(new FileReader(file))) {
            bw.write("Transcrevendo uma nova mensagen no arquivo.");
            bw.newLine(); // Encontra o \n
            bw.write("E pulando uma linha");
            bw.flush();

            String s = null;
            while((s = br.readLine()) != null) {
                // Acima, transformamos a string S uma variável para guardar o valor de br.readLine() dentro do condicionamento do loop
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
