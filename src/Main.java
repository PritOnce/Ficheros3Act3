import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try{
            String primerArchivo = JOptionPane.showInputDialog("Introduce la primera ruta");
            String segundoArchivo = JOptionPane.showInputDialog("Introduce la segunda ruta");
            String archivoFinal = JOptionPane.showInputDialog("Introduce la ruta final");

            File a1 = new File(primerArchivo);
            File a2 = new File(segundoArchivo);
            File a1_a2 = new File(archivoFinal);

            
        } catch (HeadlessException e) {
            throw new RuntimeException(e);
        }
    }
}