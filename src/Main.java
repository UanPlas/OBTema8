public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Jesús");
        persona.setEdad(23);
        persona.setTelefono("5638484048");
        System.out.println("Nombre: " + persona.getNombre() + "\nEdad: " + persona.getEdad() + "\nTeléfono: " + persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre, telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}