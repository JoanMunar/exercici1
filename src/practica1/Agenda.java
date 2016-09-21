package practica1;

import java.util.List;

/**
 * Created by jmunarb on 21/09/16.
 */
public class Agenda {

    private int any;
    private List<Pagina> pagines;

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public List<Pagina> getPagines() {
        return pagines;
    }

    public void setPagines(List<Pagina> pagines) {
        this.pagines = pagines;
    }
}
