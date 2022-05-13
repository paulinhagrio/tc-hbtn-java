
import workflow.atividade.Atividade;

import java.util.ArrayList;

public class Workflow {
    ArrayList<Atividade> atividade = new ArrayList<>();
   public void registrarAtividade(Atividade atividade){
       this.atividade.add(atividade);
   }
}
