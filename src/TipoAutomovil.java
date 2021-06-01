public enum TipoAutomovil {
    TOYOTA("Toyota", "grande", 4),
    CHEVROLET("Chevrolet", "mediano", 5),
    COOPER("Cooper", "pequeño", 2),
    AUDI("Audi", "pequeño", 4),
    MAZDA("Mazda", "mediano", 2),
    FURGON("Furgon", "grande", 6);

    private final String nombre;
    private final String descripcion;
    private final int numeroPuertas;

    TipoAutomovil(String nombre, String descripcion, int numeroPuertas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuertas = numeroPuertas;

    }


    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }


}
