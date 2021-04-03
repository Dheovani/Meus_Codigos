package Automatic_Sorting_System;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;

public class Code {
    /* O objetivo deste código é criar um sistema simples que consiga diferenciar os tipos dos arquivos
     * e em seguida criar diretórios com base nos tipos desses arquivos.
     */
    public static void main(String[] args) {
        /* Para começar, você deve invocar o método fileType() e indicar o path dos arquivos que você deseja
         * transmitir para a pasta.
         */
        fileType(Paths.get("C:\\Users\\PICHAU\\IdeaProjects\\Pessoal\\src\\AutomaticSortingSystem\\folder\\arquivo.txt"));
        fileType(Paths.get("C:\\Users\\PICHAU\\IdeaProjects\\Pessoal\\src\\AutomaticSortingSystem\\folder\\arquivo3.txt"));
        fileType(Paths.get("C:\\Users\\PICHAU\\IdeaProjects\\Pessoal\\src\\AutomaticSortingSystem\\arquivos\\arquivo2.PDF"));
    }

    public static String fileName(Path path) {
        /* Em seguida, o código irá definir um nome específico para a pasta do arquivo.
         * Esse processo é necessário pois o método Files.probeContentType() pode retornar múltiplos tipos de
         * arquivos separados por uma /.
         * Caso isso aconteça, o IntelliJ irá compreender que a / representa a criação de um novo diretório e
         * dividir tipos iguais em diretórios diferentes.
         */
        String[] fileName = new String[0];
        try {
            fileName = Files.probeContentType(path).split("/");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return String.join("", Arrays.asList(fileName));
    }

    public static void fileType(Path pathSource) {
        /* Para finalizar, iremos transmitir o path escolhido para o diretório destino e excluir os diretórios abandonados.
         */
        String pathName = String.valueOf(pathSource.getFileName());
        // Precisaremos do nome (convertido para String) do arquivo que pretendemos mover
        String pathParent = String.valueOf(pathSource.getParent().getParent());
        // Em seguida, precisaremos do Path (convertido para String) do penúltimo diretório no Path do arquivo
        String fileType = fileName(pathSource);
        // Por fim, precisaremos do tipo (convertido para String) do arquivo em questão
        // Essas informações são necessárias para montar o Path final para onde enviaremos o arquivo.

        try {
            if(Files.notExists(Paths.get(pathParent, fileType))) {
                Files.createDirectories(Paths.get(pathParent, fileType));
            }
            Files.move(pathSource, Paths.get(pathParent, fileType, pathName), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Arquivo movido para: " + fileType +
                    "\nPath: " + Paths.get(pathParent, fileType, pathName));
        } catch (IOException e) {
            e.getCause();
            e.getMessage();
            e.printStackTrace();
        }
    }
}
