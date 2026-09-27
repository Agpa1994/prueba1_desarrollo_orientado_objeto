public class Main {

    public static void main(String[] args) {

        try {

            gestorBici gestor = new gestorBici();

            // Bicicletas eléctricas
            electrica e1 = new electrica(
                    "BIC-E01",
                    2023,
                    22.5,
                    60,
                    false
            );

            electrica e2 = new electrica(
                    "BIC-E02",
                    2022,
                    24.0,
                    45,
                    true
            );

            // Bicicletas de montaña
            montana m1 = new montana(
                    "BIC-M01",
                    2021,
                    13.5,
                    2
            );

            montana m2 = new montana(
                    "BIC-M02",
                    2020,
                    12.0,
                    1
            );

            // Activar garantía extendida
            e1.activarGarantiaExtendida();

            // Registrar bicicletas
            gestor.registrarBicicleta(e1);
            gestor.registrarBicicleta(e2);
            gestor.registrarBicicleta(m1);
            gestor.registrarBicicleta(m2);

            // Búsqueda por código
            System.out.println("\n=== BUSQUEDA ===");

            Bicicleta encontrada = gestor.buscarPorCodigo("BIC-E01");

            if (encontrada != null) {
                System.out.println(encontrada);
            } else {
                System.out.println("No se encontró la bicicleta.");
            }

            // Listado completo
            System.out.println("\n=== LISTADO ===");
            gestor.listarBicicletas();

            // Costos de mantención
            System.out.println("\n=== COSTOS DE MANTENCION ===");
            gestor.mostrarCostosMantencion();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}