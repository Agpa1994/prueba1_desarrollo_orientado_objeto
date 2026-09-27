import java.util.ArrayList;

public class gestorBici {

    private ArrayList<Bicicleta> bicicletas;

    public gestorBici() {
        bicicletas = new ArrayList<>();
    }

    public void registrarBicicleta(Bicicleta bicicleta) {
        bicicletas.add(bicicleta);
        System.out.println("Bicicleta incorporada correctamente: "
                + bicicleta.getCodigoBicicleta());
    }

    public Bicicleta buscarPorCodigo(String codigo) {

        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.getCodigoBicicleta().equalsIgnoreCase(codigo)) {
                return bicicleta;
            }
        }

        return null;
    }

    public void listarBicicletas() {

        for (Bicicleta bicicleta : bicicletas) {
            System.out.println(bicicleta);
        }
    }

    public void mostrarCostosMantencion() {

        for (Bicicleta bicicleta : bicicletas) {
            System.out.println(
                    bicicleta.getCodigoBicicleta()
                            + " -> $"
                            + bicicleta.calcularCostoMantencion()
            );
        }
    }
}