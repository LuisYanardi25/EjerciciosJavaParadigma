package Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente p = new Cliente("Juan");
        Tarjeta visa = new Tarjeta(45893255);
        Perfil carpintero = new Perfil("Carpintero");
        Perfil mecanico = new Perfil("Mecanico");
        Lugar merlo = new Lugar("Merlo");
        Lugar sj = new Lugar("San Juan");
        p.setTarjeta(visa);
        p.agregarFrecuenta(merlo);
        p.agregarFrecuenta(sj);
        p.agregarPerfil(carpintero);
        p.agregarPerfil(mecanico);
        p.mostrarPerfiles();
        p.mostrarLugar();
        p.toString();
        
    
    
    
    }
}
