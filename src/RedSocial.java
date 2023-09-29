
/**
 *
 * @author si
 */
public class RedSocial extends Interes implements ILike {
    private String nombreRedSocial;

    public RedSocial() {
        super();
    }

    public RedSocial(String nombreRedSocial, String usuario, String password, int tiempoConectado, int like) {
        super(usuario, password, tiempoConectado, like);
        this.nombreRedSocial = nombreRedSocial;
    }
    

    
    public String getNombreRedSocial() {
        return nombreRedSocial;
    }

    public void setNombreRedSocial(String nombreRedSocial) {
        this.nombreRedSocial = nombreRedSocial;
    }

    @Override
    public String toString() {
        return "RedSocial{" + "nombreRedSocial=" + nombreRedSocial + '}'+" "+super.toString();
    }

    @Override
    public void visualizar() {
        System.out.println("Usuario: "+super.getUsuario());
        System.out.println("RedSocial: "+this.getNombreRedSocial());
    }

    @Override
    public void almacenarLikes() {
        System.out.println("Cantidad de likes: "+like);
        System.out.println("Tiempo Conectado: "+super.getTiempoConectado());
    }
    
    
    
}
