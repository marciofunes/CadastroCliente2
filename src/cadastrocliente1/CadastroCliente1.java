
package cadastrocliente1;

public class CadastroCliente1 {
    public static void main(String[] args) {
        
        //Instanciando um objeto
        Pessoa cliente = new Pessoa("Marcio Funes", "12345678", "Masculino", "Rua das Abobrinhas 32", "Indaituba", "SP");
        
        System.out.println(cliente.getNome());
        cliente.setNome("Chiquinho");
        System.out.println(cliente.getNome());
    }
    
}
