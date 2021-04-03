package AutomaticSortingSystem;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PathsTeste {
    public static void main(String[] args) throws IOException {
        // Aqui você deve criar seus próprios Paths de exemplo
        File dir1 = new File("C:\\Users\\PICHAU\\IdeaProjects\\Pessoal\\src\\AutomaticSortingSystem\\folder");
        File fileTeste1 = new File("C:\\Users\\PICHAU\\IdeaProjects\\Pessoal\\src\\AutomaticSortingSystem\\folder\\arquivo.txt");
        File fileTeste3 = new File("C:\\Users\\PICHAU\\IdeaProjects\\Pessoal\\src\\AutomaticSortingSystem\\folder\\arquivo3.txt");
        Files.deleteIfExists(Paths.get(String.valueOf(fileTeste1)));
        Files.deleteIfExists(Paths.get(String.valueOf(fileTeste3)));
        Files.deleteIfExists(Paths.get(String.valueOf(dir1)));
        System.out.println("Diretório criado: " + dir1.mkdir() +
                "\nArquivo criado: " + fileTeste1.createNewFile() +
                "\nPath: " + fileTeste1.getAbsolutePath());
        System.out.println("Arquivo criado: " + fileTeste3.createNewFile() +
                "\nPath: " + fileTeste3.getAbsolutePath());

        File dir2 = new File("C:\\Users\\PICHAU\\IdeaProjects\\Pessoal\\src\\AutomaticSortingSystem\\arquivos");
        File fileTeste2 = new File("C:\\Users\\PICHAU\\IdeaProjects\\Pessoal\\src\\AutomaticSortingSystem\\arquivos\\arquivo2.PDF");
        Files.deleteIfExists(Paths.get(String.valueOf(fileTeste2)));
        Files.deleteIfExists(Paths.get(String.valueOf(dir2)));
        System.out.println("Diterório criado: " + dir2.mkdir() +
                "\nArquivo criado: " + fileTeste2.createNewFile() +
                "\nPath: " + fileTeste2.getAbsolutePath());

    }
}
