import java.util.LinkedList;
import java.util.Queue;

public class FilaDeAtendimento {

    private Queue<Paciente> fila = new LinkedList<>();

    /**
     * Adiciona um paciente ao final da fila de atendimento.
     * @param p O paciente a ser adicionado.
     */
    public void adicionarPaciente(Paciente p) {
        fila.add(p);
    }

    /**
     * Remove e retorna o primeiro paciente da fila.
     * null se a fila estiver vazia.
     * @return O paciente atendido ou null.
     */
    public Paciente atenderPaciente() {
        return fila.poll();
    }

    // Verifica se a fila de atendimento está vazia.
    /**@return true se a fila estiver vazia, false caso contrário.
    */

    public boolean estaVazia() {
        return fila.isEmpty();
    }

    /**
     * Imprime no consol os pacientes na fila.
     * exibirInfo() de cada paciente.
     */
    public void mostrarFila() {
        System.out.println("\n-Fila de Atendimento Atual-");
        if (estaVazia()) {
            System.out.println("A fila de atendimento está vazia.");
        } else {
            for (Paciente paciente : fila) {
                System.out.println(paciente.exibirInfo());
            }
        }
        System.out.println("---------");
    }
}