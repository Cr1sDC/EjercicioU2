
/**
 *
 * @author si
 */
public class  Musica extends Interes implements ILike {
    private String tipoMusica;

    public Musica() {
        super();
    }

    public Musica(String tipoMusica, String usuario, String password, int tiempoConectado, int like) {
        super(usuario, password, tiempoConectado, like);
        this.tipoMusica = tipoMusica;
    }

    

    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    @Override
    public String toString() {
        return "Musica{" + "tipoMusica=" + tipoMusica + '}'+ " "+super.toString();
    }

    @Override
    public void visualizar() {
        System.out.println("Usuario: "+super.getUsuario());
        System.out.println("Tipo de Musica: " +this.getTipoMusica());
    }

    @Override
    public void almacenarLikes() {
        System.out.println("Cantidad de likes:"+super.getLike());
        System.out.println("Tiempo conectado: "+super.getTiempoConectado());
    }

    
}
