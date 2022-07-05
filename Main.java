package extraerDatos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Juegos> juegos = new ArrayList<>();
        int index = 0;
        try (BufferedReader datosJuegos = new BufferedReader(new FileReader("C:\\Users\\pc\\IdeaProjects\\POO\\src\\extraerDatos\\datos.txt"))){
            String lineaDato = datosJuegos.readLine();
            while (lineaDato != null){
                String[] datosObjeto = lineaDato.split(",");
                juegos.add(new Juegos());
                juegos.get(index).setNombre(datosObjeto[0]);
                juegos.get(index).setCategoria(datosObjeto[1]);
                juegos.get(index).setPublico(datosObjeto[2]);
                lineaDato = datosJuegos.readLine();
                index ++;
            }
        } catch (IOException e){
            System.out.println("No se pudo leer");
        }

        for (Juegos juego : juegos) {
            System.out.println(juego.toString() + "\n");
        }
    }
}