package refactor.LCD;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase es la que almacena el listado de segmentos que se utilizan para imprimir un número
 */
public class Digito {
    private List<Integer> segList = new ArrayList<>();

    /**
     * El constructor recibe el listado de Segmentos del dígito
     * @param segList
     */
    public Digito(List<Integer> segList) {
        this.segList=segList;
    }

    public List<Integer> getSegList() {
        return segList;
    }
}
