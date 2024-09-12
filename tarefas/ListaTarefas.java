import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaTarefas {
    private static List<String> tarefas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int escolha;
        do {
            System.out.println("\nMenu de Tarefas:");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Ver Tarefas");
            System.out.println("3. Remover Tarefa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); //  nova linha

            switch (escolha) {
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    verTarefas();
                    break;
                case 3:
                    removerTarefa();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválidada!");
                    break;
            }
        } while (escolha != 4);
    }

    private static void adicionarTarefa() {
        System.out.print("Digite a descrição da tarefa: ");
        String tarefa = scanner.nextLine();
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    private static void verTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa na lista.");
        } else {
            System.out.println("\nLista de Tarefas:");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". " + tarefas.get(i));
            }
        }
    }

    private static void removerTarefa() {
        verTarefas();
        if (!tarefas.isEmpty()) {
            System.out.print("Digite o número da tarefa a ser removida: ");
            int index = scanner.nextInt();
            scanner.nextLine(); // nova linha
            if (index > 0 && index <= tarefas.size()) {
                tarefas.remove(index - 1);
                System.out.println("Tarefa removida com sucesso!");
            } else {
                System.out.println("Número da tarefa inválido!");
            }
        }
    }
}
