package br.com.abc.Javacore.IO.teste;

import java.io.*;

public class FileWriterReaderTeste {
    public static void main(String[] args) {
        File file = new File("file.txt");
        // Try comum com File Writer e File Reader
        try {
            FileWriter fw = new FileWriter(file);
            fw.write("Escrevendo uma mensagem no arquivo\ne pulando uma linha.");
            fw.flush();
            fw.close();

            FileReader fr = new FileReader(file);
            char[] in = new char[500];
            fr.read(in);
            for(char reader : in) {
                System.out.print(reader);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Try with resources com File Writer e File Reader
        // Try with resources realiza automaticamente o processo de abrir e fechar arquivos
        try(FileWriter fw = new FileWriter(file);
             FileReader fr = new FileReader(file)) {
            fw.write("Escrevendo uma mensagem no arquivo\ne pulando uma linha.");
            fw.flush();

            char[] in = new char[500];
            fr.read(in);
            for(char reader : in) {
                System.out.print(reader);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
