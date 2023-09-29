
/**
 *
 * @author si
 */
public class Serie extends Interes implements ILike {
    private String generoSerie;

    public Serie() {
        super();
    }

    public Serie(String generoSerie, String usuario, String password, int tiempoConectado, int like) {
        super(usuario, password, tiempoConectado, like);
        this.generoSerie = generoSerie;
    }

    

    public String getGeneroSerie() {
        return generoSerie;
    }

    public void setGeneroSerie(String generoSerie) {
        this.generoSerie = generoSerie;
    }

    @Override
    public String toString() {
        return "Serie{" + "generoSerie=" + generoSerie + '}'+ " "+super.toString();
    }

    @Override
    public void visualizar() {
        System.out.println("Usuario: "+super.getUsuario());
        System.out.println("Genero de Pelicula/Serie: "+this.getGeneroSerie());
        
    }

    @Override
    public void almacenarLikes() {
        System.out.println("Cantidad de likes: "+like);
        System.out.println("Tiempo conectado: "+super.getTiempoConectado());
    }
    
    
}
