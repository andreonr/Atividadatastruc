import java.util.Scanner;

public class GerenciadorClinica {

//classe principal com o método main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilaDeAtendimento fila = new FilaDeAtendimento();
        PilhaHistoricoAtendimentos historico = new PilhaHistoricoAtendimentos();
        boolean executando = true;

        System.out.println("Bem vindo ao Sistema de Gerenciamento da Clínica!");

        while (executando) {
            exibirMenu();
            System.out.print("Escolha uma opção: ");


            while (!scanner.hasNextInt()) {
                System.out.println("Erro: Por favor, insira um número válido.");
                scanner.next(); 
                System.out.print("Escolha uma opção: ");
            }
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                // adiciona um paciente
                System.out.print("Digite o nome do paciente: ");
                String nome = scanner.nextLine();

                System.out.print("Digite a idade do paciente: ");
                // valida a idade do paciente
                while (!scanner.hasNextInt()) {
                    System.out.println("Erro: Idade inválida. Por favor, insira um número.");
                    scanner.next();
                    System.out.print("Digite a idade do paciente: ");
                }
                int idade = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Digite o sintoma do paciente: ");
                String sintoma = scanner.nextLine();

                Paciente novoPaciente = new Paciente(nome, idade, sintoma);
                fila.adicionarPaciente(novoPaciente);
                System.out.println("\nPaciente " + nome + " adicionado à fila com sucesso!");

            } else if (opcao == 2) {
                // opçao para atender o proximo paciente
                if (fila.estaVazia()) {
                    System.out.println("\nNão há pacientes na fila para atender.");
                } else {
                    Paciente pacienteAtendido = fila.atenderPaciente();
                    historico.adicionarAoHistorico(pacienteAtendido);
                    System.out.println("\nAtendendo o paciente:");
                    System.out.println(pacienteAtendido.exibirInfo());
                    System.out.println("Paciente adicionado ao histórico de atendimentos.");
                }

            } else if (opcao == 3) {
                // mostra a fila do atendimento
                fila.mostrarFila();

            } else if (opcao == 4) {
                // mostra o histórico de atendimentos
                historico.mostrarHistorico();

            } else if (opcao == 5) {
                executando = false;
                System.out.println("\nSaindo do sistema. Obrigado!");

            } else {
                System.out.println("\nOpção inválida. Por favor, escolha um número entre 1 e 5.");
            }
        }

        scanner.close();
    }


    public static void exibirMenu() {
        System.out.println("\n===================================================");
        System.out.println("1: Adicionar novo paciente à fila");
        System.out.println("2: Atender próximo paciente");
        System.out.println("3: Exibir fila de atendimento");
        System.out.println("4: Exibir histórico de atendimentos");
        System.out.println("5: Sair");
        System.out.println("===================================================");
    }
}