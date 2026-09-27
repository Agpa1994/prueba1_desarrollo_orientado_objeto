public class montana extends Bicicleta {

    private int cantidadSuspensiones;

    public montana(String codigoBicicleta,
                   int anioFabricacion,
                   double peso,
                   int cantidadSuspensiones) {

        super(codigoBicicleta, anioFabricacion, peso);
        setCantidadSuspensiones(cantidadSuspensiones);
    }

    public int getCantidadSuspensiones() {
        return cantidadSuspensiones;
    }

    
    public void setCantidadSuspensiones(int cantidadSuspensiones) {
        if (cantidadSuspensiones < 0) {
            throw new IllegalArgumentException("La cantidad de suspensiones no puede ser negativa.");
        }
        this.cantidadSuspensiones = cantidadSuspensiones;
    }

    @Override
    public double calcularCostoMantencion() {
        double costo = 30000;

        if (cantidadSuspensiones > 1) {
            costo *= 1.15;
        }

        return costo;
    }

    @Override
    public String toString() {

        return "Tipo: Bicicleta Montaña"
                + " | Código: " + getCodigoBicicleta()
                + " | Año: " + getAnioFabricacion()
                + " | Peso: " + getPeso() + " kg"
                + " | Suspensiones: " + cantidadSuspensiones
                + " | Costo mantención: $"
                + calcularCostoMantencion();

    }
}