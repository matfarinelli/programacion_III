package practico_6.practico_6_1.intento_0;

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

    public String getNombre() {
        return nombre;
    }

    public void addCandidato(Candidato candidato) {
        if (!this.candidatos.contains(candidato)) {
            this.candidatos.add(candidato);
        }
    }

    public void addContrato(Contrato contrato) {
        if (!this.contratos.contains(contrato)) {
            this.contratos.add(contrato);
        }
    }

    public ArrayList<Candidato> getCandidatosAcontrato(Contrato contrato) {
        ArrayList<Candidato> candidatosAptos = new ArrayList<>();

        for (Candidato candidato : this.candidatos) {
            if (candidato.evaluarContrato(contrato)) {
                candidatosAptos.add(candidato);
            }
        }

        return candidatosAptos;
    }

    // no debería usarlo. es solo para testear los equals e inserciones
    public ArrayList<Candidato> getCandidatos() {
        return new ArrayList<>(this.candidatos);
    }

    public static void main(String[] args) {

        Consultora consultora = new Consultora("Gamma");

        Candidato c1 = new Candidato("Esteban_empresa", "Apple", 1500);
        Candidato c2 = new Candidato("Marcos_horas", "Mercado Libre", 18000);
        Candidato c3 = new Candidato("Juan_sueldo", "Microsoft", 2000);
        Candidato c4 = new Candidato("Victor_exclusivo", "Adobe", 500);

        Criterio_empresa cr1 = new Criterio_empresa();
        cr1.setEmpresa(c1.getEmpresa());
        Criterio_horas cr2 = new Criterio_horas();
        cr2.setHoras(6);
        Criterio_sueldo cr3 = new Criterio_sueldo();
        cr3.setSueldo(1900);
        Criterio_exclusivo cr4 = new Criterio_exclusivo();

        c1.setCriterio(cr1);
        c2.setCriterio(cr2);
        c3.setCriterio(cr3);
        c4.setCriterio(cr4);

        consultora.addCandidato(c1);
        consultora.addCandidato(c2);
        consultora.addCandidato(c3);

        Contrato con1 = new Contrato("Tesla", 10, 2500);
        Contrato con2 = new Contrato("Youtube", 15, 4000);
        Contrato con3 = new Contrato("Google", 4, 8000);
        Contrato con4 = new Contrato("Movistar", 9, 150);

        consultora.addContrato(con1);
        consultora.addContrato(con2);
        consultora.addContrato(con3);
        consultora.addContrato(con4);

        System.out.println("Candidatos aptos para : " + con1.getEmpresa() + consultora.getCandidatosAcontrato(con1));

    }

}
