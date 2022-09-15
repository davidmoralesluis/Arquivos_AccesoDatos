import java.io.File;
import java.io.IOException;

public class Arquivos {
    File file;
    public Arquivos() {
        String fichero;
        String directorio;
    }

    public void eDirectorio(String x){
        System.out.println("Es un Directorio??");
        File dir =new File(System.getProperty("user.dir") + "/src/main/java/"+x);
        if (dir.isDirectory()){
            System.out.printf("Si");
            if (dir.isAbsolute()){
                System.out.printf(" y es absoluta");
            }
        }else{
            System.out.println("No");
        }
    }

    public void eFichero(String x){
        System.out.println("Es un fichero??");
        File fich =new File(System.getProperty("user.dir") + "/src/main/java/"+x);
        if (fich.isFile()){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
    }

    public File creaDirectorio(String name){

        File dir=new File(System.getProperty("user.dir")+"/src/main/java/"+name);

        if (!dir.exists()){
            System.out.println("Directorio creado");
            dir.mkdir();
        }else{
            System.out.println("Directorio ya existe");
        }
        return dir;
    }

    public File creaFichero(String Fichero,String Directorio) throws IOException {

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

    public void modoAcceso(File Fichero) throws IOException {

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

    public void longitude(File x){
        System.out.println("El archivo es de:"+x.length()+" caracteres");
    }

    public void mLectura(File x){
        x.setReadOnly();
        System.out.println("El archivo ahora solo tiene lectura");
    }

    public void mEscritura(File x){
        x.setWritable(true);
        System.out.println("El archivo ahora tiene escritura");
    }

    public void borrarFichero(File x){
        if (x.exists()){
            x.delete();
            System.out.println("El archivo ha sido neutralizado");
        }else {
            System.out.println("El archivo no existe");
        }
    }

    public void borrarDirectorio(File x){
        if (x.exists()){
            x.delete();
            System.out.println("El directorio ha sido neutralizado");
        }else {
            System.out.println("El archivo no existe");
        }
    }
}
