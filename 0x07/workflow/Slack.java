package workflow;

public class Slack implements CanalNotificacao{
    public String notificar(Mensagem mensagem){
        return "[SLACK] {" + mensagem.getTipoMensagem() + "}" + " - " + mensagem.getTexto();
    }
}
