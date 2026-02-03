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
            System.out.println("Nome: " + cliente.getNome() +  " | Idade: " + cliente.getIdade() +
                    " | Email: " + cliente.getEmail()
            ); } }

    public void buscarCliente(String nome){
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                System.out.println(
                        "Cliente encontrado: " +
                                cliente.getNome() + " | " +
                                cliente.getIdade() + " | " +
                                cliente.getEmail()
                );
            } } }
    public void excluirCliente(String nome){
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                System.out.println(
                        "Cliente excluido: " +
                                cliente.getNome() + " | " + cliente.getIdade() + " | " + cliente.getEmail()
                );
                clientes.remove(nome);
            } } }
    }






