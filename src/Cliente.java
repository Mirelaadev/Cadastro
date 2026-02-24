public class Cliente {
    private String cpf;
    private String nome;
    private int idade;
    private String email;

    public Cliente(String cpf, String nome, int idade, String email ){
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.email = email;

    }
    public String getCpf(){

        return cpf;
    }
    public void setCpf(String cpf){

        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
