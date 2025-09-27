package ejer14;

public class EditorVideo {
    
    public Render exportar(String formato, Proyecto proyecto) {
        System.out.println("--- Exportando video ---");
        System.out.println("Proyecto: " + proyecto.getNombre());
        System.out.println("Duración: " + proyecto.getDuracionMin() + " minutos");
        System.out.println("Formato solicitado: " + formato);
        
        // Creacion del objeto
        Render render = new Render(formato, proyecto);
        return render;
    }
}