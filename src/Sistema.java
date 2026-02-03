import java.util.Scanner;
public class Sistema {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Objeto da classe controle
        ControleCliente controle = new ControleCliente();

        int opcao;
        do {
            System.out.println("Escolha uma opção: \n" + "1 - Cadastrar\n"
                    + "2 - Listar\n" + "3 - Buscar\n" + "4 - Excluir\n" + "5 - Sair");
             opcao = entrada.nextInt();
             entrada.nextLine();

            if(opcao == 1){
                //OBJETO SÓ É CRIADO QUANDO A OPÇÃO DE CADASTAR É ESCOLHIDA
                Cliente cliente = new Cliente();

                System.out.println("Digite o nome: ");
                cliente.setNome(entrada.next());

                System.out.println("Digite a idade: ");
                cliente.setIdade(entrada.nextInt());

                System.out.println("Digite o email: ");
                cliente.setEmail(entrada.next());

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
                System.out.print("Digite o nome do cliente: ");
                String nome = entrada.nextLine();
                controle.excluirCliente(nome);
            }
        } while(opcao != 4);

        }

    }

