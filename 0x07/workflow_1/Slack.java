package workflow_1;

public class Slack implements CanalNotificacao{
    public String notificar(Mensagem mensagem){
        return "[SLACK] {" + mensagem.getTipoMensagem() + "}" + " - " + mensagem.getTexto();
    }
}
