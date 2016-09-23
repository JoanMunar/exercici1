package practica2;

/**
 * Created by jmunarb on 23/09/16.
 */
public class Garbage {

    public static void main(String[] args) {

        Garbage potato = new Garbage();

        potato = null;

        System.gc();


    }

    @Override
    protected void finalize() throws Throwable{

        System.out.println("Hola :)");

    }
}
