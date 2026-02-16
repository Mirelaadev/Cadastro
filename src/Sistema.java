import java.util.Scanner;
public class Sistema {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Objeto da classe controle
        ControleCliente controle = new ControleCliente();

        int opcao;
        do {
            System.out.println("Escolha uma opção: \n" + "1 - Cadastrar\n"
                    + "2 - Listar\n" + "3 - Buscar\n" + "4 - Editar\n" + "5 - Excluir\n" + "0 - Sair");
             opcao = entrada.nextInt();
             entrada.nextLine();

            if(opcao == 1){

                System.out.println("Digite o CPF: ");
                int cpf = entrada.nextInt();
                entrada.nextLine();

                System.out.println("Digite o nome: ");
                String nome = entrada.nextLine();

                System.out.println("Digite a idade: ");
                int idade = entrada.nextInt();
                entrada.nextLine();

                System.out.println("Digite o email: ");
                String email = entrada.nextLine();

                //OBJETO SÓ É CRIADO QUANDO A OPÇÃO DE CADASTAR É ESCOLHIDA
                Cliente cliente = new Cliente(cpf, nome, idade, email);

                controle.cadastrarCliente(cliente);
                System.out.println("Cliente cadastrado com sucesso!");

            } else if(opcao == 2){
                System.out.println("Listando clientes:");
                controle.listarCliente();

            } else if(opcao == 3){
                System.out.print("Digite o nome do cliente: ");
                String nome = entrada.nextLine();
                controle.buscarCliente(nome);

            }else if(opcao == 4){
                System.out.println("Qual cliente você deseja editar?");
                String nomeEditar = entrada.nextLine();

                //Variavel do tipo cliente que vai armazenar o cliente que usuario digitou
                Cliente cliente = controle.buscarCliente(nomeEditar);

                if(cliente != null) {
                    System.out.println("Digite o novo nome: ");
                    cliente.setNome(entrada.nextLine());

                    System.out.println("Digite a idade: ");
                    cliente.setIdade(entrada.nextInt());
                    entrada.nextLine();

                    System.out.println("Digite o email: ");
                    cliente.setEmail(entrada.next());

                    System.out.println("Cliente atualizado com sucesso!");

                }

            }else if(opcao == 5){
                System.out.print("Digite o nome do cliente: ");
                String nome = entrada.nextLine();
                controle.excluirCliente(nome);
            }
        } while(opcao != 4);

        }

    }

