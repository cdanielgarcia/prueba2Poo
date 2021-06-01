public enum Color {
    AZUL("Azul"),
    AMARILLO("Amarillo"),
    CAFE("Cafe"),
    ROJO("Rojo"),
    VERDE("Verde"),
    NARANJA("Naranja");

    private final String color;

    Color(String color){
        this.color =  color;
    }
    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
