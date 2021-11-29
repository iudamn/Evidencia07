package archivos;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class gestorArchivos {
    public void crearArchivo(String ruta, String contenido) {
        Path archivo = Paths.get(ruta);
        try {
            Files.write(archivo, contenido.getBytes());
            System.out.println("se ha guardado el archivo exitosamente");
        } catch (IOException e) {
            System.out.println("el archivo no pudo ser creado");
        }
    }

    public void añadirTexto(String ruta, String contenido) {
        String oldFile = leerArchivo(ruta);
        crearArchivo(ruta, oldFile + "\n" + contenido);

    }

    public String leerArchivo(String ruta) {
        Path archivo = Paths.get(ruta);
        String texto = "";
        try {
            texto = new String(Files.readAllBytes(archivo));
        } catch (IOException e) {
            System.out.println("El archivo no pudo ser leido");
        }
        return texto;
    }

    public void crearDirectorio(String ruta) {
        Path directorio = Paths.get(ruta);
        if (Files.exists(directorio)) {
            System.out.println("el directorio ya existe");
        } else {
            try {
                Files.createDirectories(directorio);
                System.out.println("El directorio fue creado exitosamente");
            } catch (IOException e) {
                System.out.println("El directorio no pudo ser creado");
            }
        }
    }

    public String[] listaArchivos(String ruta) {
        File f = new File(ruta);
        String[] archivos = f.list();
        return archivos;

    }


}


