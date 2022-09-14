import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("MENU\n1.eDirectorio");

        String Fichero="Fichero";
        String Directorio="Directorio";

        File nosoDirectorio=creaDirectorio(Directorio);
        File nosoFichero = creaFichero(Fichero,Directorio);

        modoAcceso(nosoFichero);

        longitude(nosoFichero);
    }

    public static void eDirectorio(File x){
        System.out.println("Es un Directorio??");
        if (x.isDirectory()){
            System.out.printf("Si");
            if (x.isAbsolute()){
                System.out.printf(" y es absoluta");
            }
        }else{
            System.out.println("No");
        }
    }

    public static void eFichero(File x){
        System.out.println("Es un fichero??");
        if (x.isFile()){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
    }

    public static File creaDirectorio(String name){

        File dir=new File(System.getProperty("user.dir")+"/src/main/java/"+name);

        if (!dir.exists()){
            System.out.println("Directorio creado");
            dir.mkdir();
        }else{
            System.out.println("Directorio ya existe");
        }
        return dir;
    }

    public static File creaFichero(String Fichero,String Directorio) throws IOException {

        File dir=new File(System.getProperty("user.dir")+"/src/main/java/"+Directorio);
        if (dir.exists()){
            System.out.println("siiiiiii");
            dir=new File(System.getProperty("user.dir")+"/src/main/java/"+Directorio+"/"+Fichero);
            dir.createNewFile();
        }else {
            System.out.println("Directorio no existe");
        }
        return dir;
    }

    public static void modoAcceso(File Fichero) throws IOException {

        if (Fichero.canWrite()){
            System.out.println("Yes we can...Write");
        }else{
            System.out.println("No puedes escribir");
        }
        if (Fichero.canRead()){
            System.out.println("Yes we can...Read");
        }else{
            System.out.println("No puedes leer");
        }
    }

    public static void longitude(File x){
        System.out.println("El archivo es de:"+x.length()+" caracteres");
    }

    public static void mLectura(File x){
        x.setReadOnly();
        System.out.println("El archivo ahora solo tiene lectura");
    }

    public static void mEscritura(File x){
        x.setWritable(true);
        System.out.println("El archivo ahora tiene escritura");
    }

    public static void borrarFichero(File x){
        if (x.exists()){
            x.delete();
            System.out.println("El archivo ha sido neutralizado");
        }else {
            System.out.println("El archivo no existe");
        }
    }

    public static void borrarDirectorio(File x){
        if (x.exists()){
            x.delete();
            System.out.println("El directorio ha sido neutralizado");
        }else {
            System.out.println("El archivo no existe");
        }
    }


}
