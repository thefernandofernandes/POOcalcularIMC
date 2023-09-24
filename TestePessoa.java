package entidades;

public class TestePessoa {

	public static void main(String[] args) {
		
		//criando objeto p do tipo da classe pessoa
		Pessoa p = new Pessoa("João", 25, 80.0);		
		
		System.out.println("Nome: " + p.getNome());
		System.out.println("Idade: " + p.getIdade());
				
		p.setNome("Pedro");
		p.setIdade(30);
		
		//definindo idade inválida
		p.setIdade(-5);

		//exibindo os detalhes atualizados das pessoas
		System.out.println("Nome atualizado: " + p.getNome());
		System.out.println("Idade atualizada: " + p.getIdade());
		System.out.println("Peso: " + p.getPeso());
		
		System.out.println("IMC: " + p.calcularIMC());
		System.out.println("Status de saúde: " + p.statusSaude());
		
	}

}
