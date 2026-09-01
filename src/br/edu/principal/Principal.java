package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacidade = 5;
        String[] nomes = new String[capacidade];
        String[] celulares = new String[capacidade];
        String[] emails = new String[capacidade];
        int quantidade = 0;

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== AGENDA DE CONTATOS ===");
            System.out.println("1. Cadastrar contato");
            System.out.println("2. Listar contatos");
            System.out.println("3. Buscar contato");
            System.out.println("4. Excluir contato");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (quantidade < capacidade) {
                        System.out.print("Digite o nome: ");
                        nomes[quantidade] = scanner.nextLine();
                        System.out.print("Digite o celular: ");
                        celulares[quantidade] = scanner.nextLine();
                        System.out.print("Digite o e-mail: ");
                        emails[quantidade] = scanner.nextLine();
                        quantidade++;
                        System.out.println("Contato cadastrado com sucesso!");
                    } else {
                        System.out.println("Agenda cheia! Não é possível cadastrar novos contatos.");
                    }
                    break;

                case 2:
                    if (quantidade == 0) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {
                        System.out.println("\n--- LISTA DE CONTATOS ---");
                        for (int i = 0; i < quantidade; i++) {
                            System.out.println("Contato " + (i + 1) + ":");
                            System.out.println("  Nome: " + nomes[i]);
                            System.out.println("  Celular: " + celulares[i]);
                            System.out.println("  E-mail: " + emails[i]);
                        }
                    }
                    break;

                case 3:
                    if (quantidade == 0) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {
                        System.out.print("Digite o nome do contato para buscar: ");
                        String busca = scanner.nextLine();
                        boolean encontrado = false;

                        for (int i = 0; i < quantidade; i++) {
                            if (nomes[i].equalsIgnoreCase(busca)) {
                                System.out.println("\nContato encontrado:");
                                System.out.println("  Nome: " + nomes[i]);
                                System.out.println("  Celular: " + celulares[i]);
                                System.out.println("  E-mail: " + emails[i]);
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("Contato não encontrado.");
                        }
                    }
                    break;

                case 4:
                    if (quantidade == 0) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {
                        System.out.print("Digite o nome do contato que deseja excluir: ");
                        String buscaExcluir = scanner.nextLine();
                        int indiceExcluir = -1;

                        for (int i = 0; i < quantidade; i++) {
                            if (nomes[i].equalsIgnoreCase(buscaExcluir)) {
                                indiceExcluir = i;
                                break;
                            }
                        }

                        if (indiceExcluir != -1) {
                            for (int i = indiceExcluir; i < quantidade - 1; i++) {
                                nomes[i] = nomes[i + 1];
                                celulares[i] = celulares[i + 1];
                                emails[i] = emails[i + 1];
                            }
                            nomes[quantidade - 1] = null;
                            celulares[quantidade - 1] = null;
                            emails[quantidade - 1] = null;
                            quantidade--;
                            System.out.println("Contato excluído com sucesso!");
                        } else {
                            System.out.println("Contato não encontrado.");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
