import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File f=new File(System.getProperty("user.dir") + "/src/main/java/");
        Arquivos file=new Arquivos();
        Scanner intro=new Scanner(System.in);
        int menu=0;

        do{
            menu=0;
            System.out.println("\n\n---MENU---\n1 -> eDirectorio\n2 -> eFichero\n3 -> creaDirectorio\n4 -> creaFichero\n5 -> modoAcceso\n6 -> Longitude\n7 -> setLectura\n8 -> setEscritura\n9 -> borrarFichero\n10 -> borrarDirectorio\n0 -> Exit\n");

            menu= intro.nextInt();intro.nextLine();

            switch (menu){

                case 1:
                    System.out.println("Introduce en nombre del directorio");
                    file.eDirectorio(intro.nextLine());
                    break;

                case 2:
                    System.out.println("Introduce en nombre del fichero");
                    file.eFichero(intro.nextLine());
                    break;

                case 3:
                    System.out.println("Introduce en nombre del Directorio");
                    file.creaDirectorio(intro.nextLine());
                    break;

                case 4:
                    System.out.println("Introduce en nombre del Fichero");
                    file.eFichero(intro.nextLine());
                    break;
            }

        }

        while (menu!=0);

    }




}
