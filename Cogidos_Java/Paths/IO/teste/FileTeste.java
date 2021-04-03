package br.com.abc.Javacore.IO.teste;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTeste {
    public static void main(String[] args) {
        File file = new File("File.txt");
        try {
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
            System.out.println("Permissão de leitura? " + file.canRead());
            System.out.println("Executável? " + file.canExecute());
            System.out.println("Path: " + file.getPath());
            System.out.println("Path completo: " + file.getAbsolutePath());
            System.out.println("Diretório? " + file.isDirectory());
            System.out.println("Oculto? " + file.isHidden());
            System.out.println("Última modificação? " + file.lastModified()); // Em milisegundos
            System.out.println("Última modificação? " + new Date(file.lastModified())); // Data
            if(file.exists()) {
                System.out.println("Deletado? " + file.delete());
            }
            /* Utilizamos uma variável boolean para descobrir se o arquivo foi criado no diretório determinado
             * Abrindo o diretório, temos a confirmação
             * Ao executarmos o programa, a primeira execução retornará true. As demais retornarão false, uma vez que o arquivo já foi criado
             */
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
