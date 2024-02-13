package practico_5_2;

import java.util.ArrayList;

public class Sombrero {

    public Sombrero() {

    }

    public void seleccionarCasa(Alumno alumno, ArrayList<Casa> casas) {

        for (Casa casa : casas) {
            if (alumno.getCasa() == null) {
                casa.isAdmisible(alumno);
            }
        }
    }

}
