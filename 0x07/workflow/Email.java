

public class Email implements CanalNotificacao{
    public String notificar(Mensagem mensagem){
        return "[EMAIL] {" + mensagem.getTipoMensagem() + "}" + " - " + mensagem.getTexto();
    }
}
