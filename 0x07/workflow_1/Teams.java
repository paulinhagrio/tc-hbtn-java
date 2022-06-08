package workflow_1;

public class Teams implements CanalNotificacao{
    public String notificar(Mensagem mensagem){
        return "[TEAMS] {" + mensagem.getTipoMensagem() + "}" + " - " + mensagem.getTexto();
    }
}
