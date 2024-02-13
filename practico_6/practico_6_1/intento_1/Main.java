package practico_6.practico_6_1.intento_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Consultora consultora = new Consultora("Consultora XYZ");

        // Crear 10 contratos, uno por cada empresa top de SPY500
        String[] empresas = {"Apple", "Microsoft", "Amazon", "Facebook", "Google", "Tesla", "Netflix", "Adobe", "Nvidia", "PayPal"};
        for (String empresa : empresas) {
            Contrato contrato = new Contrato(empresa, 6, 6000.0); // Se asume 8 horas semanales y sueldo de 5000
            consultora.addContrato(contrato);
        }

        // Crear 10 candidatos con nombres y datos de los últimos goleadores de la liga española
        String[] nombres = {"Lionel", "Karim", "Luis", "Cristiano", "Gerard", "Roger", "Iago", "Youssef", "Javier", "Mikel"};
        String[] apellidos = {"Messi", "Benzema", "Suarez", "Ronaldo", "Moreno", "Martinez", "Aspas", "En-Nesyri", "Hernandez", "Oyarzabal"};
        Criterio[] criterios = {
            new Criterio_empresa("Apple"),
            new Criterio_sueldo(6000.0),
            new Criterio_horas(10),
            new Criterio_empresa("Facebook"),
            new Criterio_sueldo(4000.0),
            new Criterio_horas(8),
            new Criterio_empresa("Google"),
            new Criterio_sueldo(5500.0),
            new Criterio_horas(10),
            new Criterio_exclusivo()
        };
        
        for (int i = 0; i < 10; i++) {
            Candidato candidato = new Candidato(nombres[i], apellidos[i], 30); // Se asume una edad de 30 años
            candidato.setCriterio(criterios[i]);
            consultora.addCandidato(candidato);
        }

        // Obtener lista de potenciales candidatos para cada contrato
        // for (Contrato contrato : consultora.getContratos()) {
        //     ArrayList<String> candidatosAptos = consultora.getCandidatosParaContratoDado(contrato);
        //     System.out.println("Potenciales candidatos para el contrato de la empresa " + contrato.getEmpresa() + ":");
        //     for (String candidato : candidatosAptos) {
        //         System.out.println(candidato);
        //     }
        //     System.out.println("--------------------");
        // }

            Contrato la_oportunidad = new Contrato("AEG",2,7000);

        System.out.println("Candidatos para contrato nuevo: " + consultora.getCandidatosParaContratoDado(la_oportunidad));

    }
}
