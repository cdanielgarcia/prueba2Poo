public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;

    private static Color colorPatente = Color.NARANJA;
    private static int capacidadEstanqueEstatico = 30;
    private static int ultimoId;
    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final int VELOCIDAD_MAXIMA_CIUDAD = 50;
    public static final String COLOR_ROJO = "rojo";
    public static final String COLOR_AMARILLO = "amarillo";
    public static final String COLOR_VERDE = "verde";
    public static final String COLOR_CAFE = "cafe";
    public static final String COLOR_AZUL = "azul";
    public static final String COLOR_NARANJA = "naranja";
    private TipoAutomovil tipo;

    public Automovil() {
        this.id = ++ultimoId;
    }
    //para llamar constructores y ahorrar lineas de codigo, ver la magia

    public Automovil(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante,modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo,Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }
    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque,
                     Persona conductor, Rueda[] ruedas){
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCapacidadEstanqueEstatico(){
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico){
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if(estanque == null){
            this.estanque = new Estanque();
        }
        return estanque;

    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public String detalle(){
        String detalle = "id =" + this.id +
                "\nfabricante = " + this.fabricante +
                "\nmodelo = " + this.modelo;
        if(this.getTipo()!= null){
            detalle += "\ntipo = " + getTipo().getDescripcion();
        }
        detalle += "\ncolor = " + this.color +
                "\ncolor patente = " + colorPatente;
        if(this.motor != null) {
            detalle = "\ncilindraje = " + this.motor.getCilindrada();
        }
        if(conductor != null) {
            detalle += ("\nconductor auto " + this.getConductor());
        }

        if(getRuedas() != null) {
            detalle += "\nRuedas del automovil: ";
            for (Rueda r : this.getRuedas()) {
                detalle += "\n"+ "fabricante " + r.getFabricante() + " aro " + r.getAro()
                        + " ancho " + r.getAncho();
            }
        }
        return detalle;

    }
    public String acelerar(int rpm){
        return "el auto " + this.fabricante + " acelerando a "+ rpm + " rpm";
    }
    public String frenar(){
        return this.fabricante +" " + this.modelo + " frenando";
    }
    public String aceleraFrena(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }
    public float calcularConsumo(int km, float porcentajeBencina){
        return km/(this.getEstanque().getCapacidad()*porcentajeBencina);
    }
    public static float calcularConsumoEstatico(int km, int porcentajeBencina){
        return km/(Automovil.capacidadEstanqueEstatico*(porcentajeBencina/100f));
    }
    public double calcularConsumo(double km, double porcentajeBencina){
        return km/(this.getEstanque().getCapacidad()*(porcentajeBencina/100));
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Automovil)){
            return false;
        }
        if (this == obj){
            return true;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante!= null && this.modelo!= null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));

    }

    @Override
    public String toString() {
        return "Automovil{" +
                "id ='" + id +'\'' +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindraje=" + estanque +
                '}';
    }
}
