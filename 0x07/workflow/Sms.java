

public class Sms implements CanalNotificacao{
    public String notificar(Mensagem mensagem){
        return "[SMS] {" + mensagem.getTipoMensagem() + "}" + " - " + mensagem.getTexto();
    }
}
