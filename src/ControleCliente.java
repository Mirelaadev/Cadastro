import java.util.ArrayList;

public class ControleCliente {
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public void cadastrarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void listarCliente() {
        //O METODO ISEMPTY VERIFICA SE A QUANTIDADE DE STRING É = 0
        if(clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado!");
        }
        for (Cliente cliente : clientes) {
            System.out.println("Cpf: " + cliente.getCpf() + " | Nome: " + cliente.getNome() +  " | Idade: " + cliente.getIdade() +
                    " | Email: " + cliente.getEmail());
        } }

    //Esse metodo vai buscar e devolver um Cliente
    public Cliente buscarCliente(String nome){
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Cliente encontrado: " + cliente.getCpf() +" | " + cliente.getNome()
                        + " | " + cliente.getIdade() + " | " + cliente.getEmail()
                );
                return cliente;
            } }
    System.out.println("Cliente não encontrado");
        return null;
    }
    public void excluirCliente(String nome){
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                System.out.println(
                        "Cliente excluido: " + cliente.getCpf() +" | " + cliente.getNome() + " | " + cliente.getIdade() +
                                " | " + cliente.getEmail()
                );
                clientes.remove(nome);
            } } }

    }






