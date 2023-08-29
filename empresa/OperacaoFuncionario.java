package empresa;

import java.util.Scanner;
import java.util.Calendar;

public class OperacaoFuncionario {

	Scanner sc= new Scanner(System.in);
	public static void validos(Funcionario f) {
		if(f.validarCPF(f.getCpf())==true) {
			System.out.println("O CPF de "+f.getNome()+" é válido");
		}
		else if(f.validarCPF(f.getCpf())== false) {
			System.out.println("O CPF de "+f.getNome()+" é inválido");
		}
		if(f.validarAnoNas(f.getNas())==true) {
			System.out.println("O ano de nascimento de "+f.getNome()+" é válido");
		}
		else if(f.validarAnoNas(f.getNas())== false) {
			System.out.println("O ano de nascimento de "+f.getNome()+" é inválido");
		}
		if(f.validarAnoAdmi(f.getAdmi())==true) {
			System.out.println("O ano de adimição de "+f.getNome()+" é válido");
		}
		else if(f.validarAnoAdmi(f.getAdmi())== false) {
			System.out.println("O ano de adimição de "+f.getNome()+" é inválido\n");
		}
		
	}
	
	public static void qtdSexo(Funcionario[] f) {
		int masc=0, fem=0;
		for(int i = 0; i<f.length;i++) {
			if(f[i].getSexo()=='m'||f[i].getSexo()=='M') {
				 masc++;
			}
			else if (f[i].getSexo()=='f'||f[i].getSexo()=='F') {
				fem++;
			}
		}
		System.out.println("A quantidade de homens é: "+masc+
				"\nE a quantidade de mulheres é: "+fem);
	}
	public static void maiormenorSalario(Funcionario[] f) {
		double maior=0;
		double menor=0;
		for(int i = 0; i<f.length;i++) {
			if(f[i].SalLiq(f[i].getSalbru())>maior) {
				maior=f[i].SalLiq(f[i].getSalbru());
			}
		}
			menor= maior;
		for(int i=0;i<f.length;i++) {
			if(f[i].SalLiq(f[i].getSalbru())<menor) {
				menor=f[i].SalLiq(f[i].getSalbru());
			}
		}
			System.out.println("O maior salário é: "+maior);
			System.out.println("O menor salário é: "+menor);
		
	}
	public static void maiormenorIdade(Funcionario[] f) {
		int maior=0;
		int menor = 0;
		for(int i=0; i<f.length;i++) {
			if(f[i].returnIdade(f[i].getNas().get(Calendar.YEAR))>maior)
				maior=f[i].getNas().get(Calendar.YEAR);
		}
			menor = maior;
		for(int i=0;i<f.length;i++) {	
			if(f[i].returnIdade(f[i].getNas().get(Calendar.YEAR))<menor)
				menor = f[i].getNas().get(Calendar.YEAR);
		}
		System.out.println("A maior idade é: "+maior+" anos");
		System.out.println("A menor idade é: "+menor+" anos");
	}
	public static void dataAposentar(Funcionario f) {
		if(f.dataAposentadoria(f.getAdmi(), f.getSexo())==true)
			System.out.println("O funcionario "+f.getNome()+" vai se aposentar ou já"
					+ "está aposentado");
		else
			System.out.println("O funcionario "+f.getNome()+" ainda não pode se"
					+ " aposentar");
	}
	public static void bonificacao(Funcionario[] f) {
		double aux = 0;
		for(int i=0; i<f.length;i++) {
		System.out.println("A bonificação do "+f[i].getNome()+" é "
		+f[i].getBonificacao(f[i]));
		aux += f[i].getBonificacao(f[i]);
		}
		System.out.println("O valor total a se pagar na bonificação dos funcionários é: "+aux);
	}
}