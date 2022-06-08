package workflow_1;

public class Email implements CanalNotificacao{
    public String notificar(Mensagem mensagem){
        return "[EMAIL] {" + mensagem.getTipoMensagem() + "}" + " - " + mensagem.getTexto();



        //[EMAIL] {<tipo da mensagem>} - <texto da mensagem>

        //[TEAMS] {LOG} - video3.mkv - MKV
    }
}
