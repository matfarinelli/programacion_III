package practico_6.practico_6_1.intento_1;

import java.util.ArrayList;

public class Consultora {

    private String nombre;
    private ArrayList<Candidato> candidatos;
    private ArrayList<Contrato> contratos;

    public Consultora(String nombre) {
        this.nombre = nombre;
        this.candidatos = new ArrayList<>();
        this.contratos = new ArrayList<>();
    }

    // getter

    public String getNombre() {
        return this.nombre;
    }

    // funciones

    public void addCandidato(Candidato candidato) {
        // si no está repetido - que lo agregue . Implementar equals en candidato
        if (!this.candidatos.contains(candidato)) {
            this.candidatos.add(candidato);
        }
    }

    public void addContrato(Contrato contrato) {
        // si no está repetido - que lo agregue . Implementar equals en contrato
        if (!this.contratos.contains(contrato)) {
            this.contratos.add(contrato);
        }
    }

    public ArrayList<String> getContratosString() {
        ArrayList<String> contratos = new ArrayList<>();

        for (Contrato contrato : this.contratos) {
            contratos.add(contrato.toString());
        }

        return contratos;
    }

    // solucion a problema

    public ArrayList<String> getCandidatosParaContratoDado(Contrato contrato) {
        ArrayList<String> candidatosAptos = new ArrayList<>();

        for (Candidato candidato : this.candidatos) {
            if (candidato.evaluarContrato(contrato)) {
                String nombreCompleto = candidato.getNombre() + " " + candidato.getApellido();
                candidatosAptos.add(nombreCompleto);
            }
        }

        return candidatosAptos;
    }

    public ArrayList<Contrato> getContratos() {
        return new ArrayList<Contrato>(this.contratos);
    }

}
