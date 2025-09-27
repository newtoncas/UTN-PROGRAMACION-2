package ejer14;
public class ejer14main {

    public static void main(String[] args) {
        
        Proyecto proyecto = new Proyecto("Clases en Java", 15); //nombre del video y minutos de duracion
        
        // Creacion de objetos
        EditorVideo editor = new EditorVideo();
        Render renderGenerado = editor.exportar("MP4", proyecto);
        
    }
}