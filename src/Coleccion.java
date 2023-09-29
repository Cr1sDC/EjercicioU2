
import java.util.ArrayList;


/**
 *
 * @author si
 */
public class Coleccion {
    private ArrayList<Interes>listaInteres;

    public Coleccion() {
        listaInteres = new ArrayList<>();
    }
    
    public boolean agregar(Interes interes){
        return listaInteres.add(interes);
        
    }
    
    public void listar(){
        for(Interes interes : listaInteres){
            System.out.println(interes);
        }
    }
    
    public void masLikes(){
        int mayor=0;
        String claseInteres="";
        for(Interes interes : listaInteres){
            if(interes.getLike()>0){
                mayor=interes.getLike();
                claseInteres = interes.getClass().getName();
            }
        }
    }
    
    
}
