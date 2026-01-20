// Public : serve para que todas as classes tenham acesso ao metodo , no caso compartilhar com o resto do codigo . //

// Void : serve para nao dar retorno nenhum, no caso vai executar algo no metodo porem nao vai dar retorno nele . //

// Class : serve para declarar a variavel . //

// Get : serve para pegar um valor na classe . //

// Set : serve para setar o valor na classe . //

public class PrimeiraClass {

    public static void main(String[] args) {
        System.out.println("Ola Gustavo");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua 1");
        cliente.setCodigo(1);
        System.out.println(cliente.getCodigo());
        //cliente.imprimirEndereco();
        String end = cliente.retornarNomeCliente();
        System.out.println(cliente.retornarNomeCliente());
        System.out.println(cliente.getValorTotal());
    }
}
