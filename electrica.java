public class electrica extends Bicicleta implements garantiaExtendida {

    private int autonomiaKm;
    private boolean bateriaCertificada;
    private boolean garantiaExtendida;

    public electrica(String codigoBicicleta,
                     int anioFabricacion,
                     double peso,
                     int autonomiaKm,
                     boolean bateriaCertificada) {

        super(codigoBicicleta, anioFabricacion, peso);
        setAutonomiaKm(autonomiaKm);
        setBateriaCertificada(bateriaCertificada);
        this.garantiaExtendida = false;
    }

    public int getAutonomiaKm() {
        return autonomiaKm;
    }

    public void setAutonomiaKm(int autonomiaKm) {
        if (autonomiaKm <= 0) {
            throw new IllegalArgumentException("La autonomía debe ser mayor que cero.");
        }
        this.autonomiaKm = autonomiaKm;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }

    @Override
    public double calcularCostoMantencion() {
        double costo = 45000;

        //En consideración de que se debe sumar un 25% mas, mejor multiplicamos por 1.25 :v
        if (!bateriaCertificada) {
            costo *= 1.25;
        }

        return costo;
    }

    @Override
    public boolean tieneGarantiaExtendida() {
        return garantiaExtendida;
    }

    @Override
    public void activarGarantiaExtendida() {
        garantiaExtendida = true;
    }

    @Override
    public String toString() {

        return "Tipo: Bicicleta Eléctrica"
                + " | Código: " + getCodigoBicicleta()
                + " | Año: " + getAnioFabricacion()
                + " | Peso: " + getPeso() + " kg"
                + " | Autonomía: " + autonomiaKm + " km"
                + " | Batería certificada: "
                + (bateriaCertificada ? "Sí" : "No")
                + " | Garantía extendida: "
                + (garantiaExtendida ? "Sí" : "No")
                + " | Costo mantención: $"
                + calcularCostoMantencion();
    }
}