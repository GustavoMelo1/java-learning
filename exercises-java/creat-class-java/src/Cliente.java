
// Public : serve para que todas as classes tenham acesso ao metodo , no caso compartilhar com o resto do codigo . //

// Void : serve para nao dar retorno nenhum, no caso vai executar algo no metodo porem nao vai dar retorno nele . //

// Class : serve para declarar a variavel //

public class Cliente {

    //Int e para colocar um valor inteiro//
    private int codigo;

    //String serve para colocar em tipo de texto //
    private String nome;

    private String endereco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void cadastrarEndereco(String endereco) {
        setEndereco(endereco);
    }

    public void imprimirEndereco() {
        System.out.println(this.endereco);
    }

    public String retornarNomeCliente() {
        return "Endereco do Gustavo";

    }

    public int getValorTotal() {
        return 20;
    }
}