import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadordeContatos {
    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("===== Gerenciador de Contatos =====");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Lista de Contatos");
            System.out.println("3. Buscar Contatos por Nome");
            System.out.println("4. Editar Contato");
            System.out.println("5. Excluir Contato");
            System.out.println("6. Sair");
            System.out.println("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    System.out.print("Nome do Contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Número de Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Endereço de E-mail: ");
                    String email = scanner.nextLine();
                    Contato novoContato = new Contato(nome,telefone,email);
                    contatos.add(novoContato);
                    System.out.println("Contato adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Lista de Contatos:");
                    for (int i = 0; i < contatos.size(); i++) {
                        System.out.println(i + ". " + contatos.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do contato a ser buscado: ");
                    String nomeBusca = scanner.nextLine();
                    System.out.println("Resultado da Busca:");
                    for (Contato contato : contatos) {
                        if (contato.getNome().equalsIgnoreCase(nomeBusca)){
                            System.out.println(contato);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Digite o índice do contato a ser editado: ");
                    int indiceEdicao = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer

                    if (indiceEdicao >= 0 && indiceEdicao < contatos.size()) {
                        Contato contatoEditado = contatos.get(indiceEdicao);
                        System.out.println("Editando Contato:");
                        System.out.print("Novo Nome: ");
                        String novoNome = scanner.nextLine();
                        System.out.print("Novo Número de Telefone: ");
                        String novoTelefone = scanner.nextLine();
                        System.out.print("Novo Endereço de Email: ");
                        String novoEmail = scanner.nextLine();

                        contatoEditado = new Contato(novoNome, novoTelefone, novoEmail);
                        contatos.set(indiceEdicao, contatoEditado);
                        System.out.println("Contato editado com sucesso!");
                    } else {
                        System.out.println("Índice de contato inválido!");
                    }
                    break;

                case 5:
                    System.out.print("Digite o índice do contato a ser excluído: ");
                    int indiceExclusao = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer

                    if (indiceExclusao >= 0 && indiceExclusao < contatos.size()) {
                        Contato contatoExcluido = contatos.remove(indiceExclusao);
                        System.out.println("Contato excluído com sucesso:");
                        System.out.println(contatoExcluido);
                    } else {
                        System.out.println("Índice de contato inválido!");
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 6);

        scanner.close();

            }


        }


