package practico_6.practico_6_1.intento_1;

public class Criterio_empresa extends Criterio {

    private String empresa;

    public Criterio_empresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public boolean evaluarContrato(Contrato ofertaLaboral) {
        return this.empresa.equals(ofertaLaboral.getEmpresa());
    }

}
