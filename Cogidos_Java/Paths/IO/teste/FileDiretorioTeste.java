package br.com.abc.Javacore.IO.teste;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTeste {
    public static void main(String[] args) {
        buscarArquivos();
        File fileDirectory = new File("folder");
        boolean mkdir = fileDirectory.mkdir();
        System.out.println("Diretório criado: " + mkdir);
        try {
            File arquivo = new File("C:\\Users\\PICHAU\\IdeaProjects\\JavaOnline\\folder\\arquivo.txt");
            // É possível criar um arquivo passando o caminho completo até o arquivo
            File arquivo2 = new File(fileDirectory, "arquivo2.txt");
            // É possível criar um arquivo indicando o diretório onde ele está e o nome do arquivo
            boolean newFile = arquivo.createNewFile();
            boolean newFile2 = arquivo2.createNewFile();
            System.out.println("Arquivo criado: " + newFile);
            System.out.println("Arquivo2 criado: " + newFile2);

            // Renomeando arquivos
            File arquivoNovoNome = new File(fileDirectory, "arquivoRenomeado.txt");
            boolean renamed = arquivo.renameTo(arquivoNovoNome);
            System.out.println("Renomeado? " + renamed);

            // Renomeando diretórios
            File renamedDirectory = new File("folderRenomeado");
            boolean mkdirRenamed = fileDirectory.renameTo(renamedDirectory);
            System.out.println("Diretório renomeado? " + mkdirRenamed);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void buscarArquivos() {
        File file = new File("C:\\Users\\PICHAU\\IdeaProjects\\JavaOnline");
        String[] list = file.list();
        for(String arquivo : list) {
            System.out.println(arquivo);
        }
    }
}
