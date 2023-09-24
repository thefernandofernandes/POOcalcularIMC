// Autor: Fernando Fernandes dos Santos
package entidades;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double peso;
	
	public Pessoa(String _nome, int _idade, double _peso) {
		
		this.nome = _nome;
		this.idade = _idade;	
		this.peso = _peso;
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
		if (idade >= 0) {
			this.idade = idade;
		}else {
			System.out.println("Idade inválida");
		}		
		
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0 && peso < 500) {
			this.peso = peso;
		}
		
		System.out.println("Peso inválido");
	}
	
	public void alterarPeso(double quantidade) {
		double novoPeso = this.peso + quantidade;
		this.setPeso(novoPeso);
	}
	
	public double calcularIMC() {
		double altura = 1.75; // altura fixa 
		return this.peso / (altura * altura);
	}
	
	public String statusSaude() {
		double imc = this.calcularIMC();
		
		if (imc < 18.5) {
			return "Abaixo do peso";
			
		}else if(imc >= 18.5 && imc < 25){
			return "Normal";
		}else if(imc >= 25 && imc < 30){
			return "Sobrepeso";
		}else {
			return "Obesidade";
		}
		
	}
	
}
