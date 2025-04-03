public enum Descuentos {
    ECODTO(0.10),
    DESC2(0.15),
    SIN_DESCUENTO(0.0);

    private final double descuento;

    Descuentos(double descuento) {
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }
}