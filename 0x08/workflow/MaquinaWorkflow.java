

public class MaquinaWorkflow {
        public void executar(Workflow workflow){
            for (int i=0; i<workflow.atividade.size(); i++){
                workflow.atividade.get(i).executar();
            }
        }
}
