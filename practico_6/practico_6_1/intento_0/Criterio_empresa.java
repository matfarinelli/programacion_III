package practico_6.practico_6_1.intento_0;

public class Criterio_empresa extends Criterio {

    private String empresa;

    @Override
    public boolean evaluarContrato(Contrato contrato) {
        return (!this.empresa.equals(contrato.getEmpresa()));
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

}
