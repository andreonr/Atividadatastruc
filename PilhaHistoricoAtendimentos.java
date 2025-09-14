import java.util.Stack;

public class PilhaHistoricoAtendimentos {

    private Stack<Paciente> historico = new Stack<>();

//Essa classe representa ou melhor, gerencia o histórico de atendimento usando o Stack.

    /** Adiciona um paciente atendido ao topo da pilha de histórico.
     * @param p O paciente atendido.
     */
    public void adicionarAoHistorico(Paciente p) {
        historico.push(p);
    }

    /**
     * @return O último paciente atendido, ou null se o histórico estiver vazio.
     */
    public Paciente verUltimoAtendido() {
        if (historico.isEmpty()) {
            return null;
        }
        return historico.peek();
    }

    public void mostrarHistorico() {
        System.out.println("\n--Histórico de Atendimentos(do mais atual ao mais antigo)--");
        if (historico.isEmpty()) {
            System.out.println("Nenhum paciente foi atendido ainda.");
        } else {

            for (int i = historico.size() - 1; i >= 0; i--) {
                Paciente paciente = historico.get(i);
                System.out.println(paciente.exibirInfo());
            }
        }
        System.out.println("--------------------------------");
    }
}