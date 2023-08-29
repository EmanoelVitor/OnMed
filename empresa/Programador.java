package empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Programador extends Funcionario {
	public String[] linguagem;
	
	public Programador() {
		super();
		linguagem= new String[5];
	}
	public Programador(String cpf, String nome, char sexo, double salbru,
			GregorianCalendar nas , GregorianCalendar admi, String[] linguagem) {
		this.linguagem= linguagem;
		this.setCpf(cpf);
		this.setNome(nome);
		this.setSexo(sexo);
		this.setSalbru(salbru);
		this.setAdmi(admi);
		this.setNas(nas);
	}
	public boolean programaMesmasLinguagens(Programador p) {
		return linguagem.equals(this.linguagem);
	}
	public String toString() {
		return "CPF: "+getCpf()+"\nNOME:"+getNome()+"\nGÊNERO: "+getSexo()+
				 "\nSALÁRIO: "+getSalbru()+"/nLinguagens: "+linguagem[0]+", "+linguagem[1]+", "+
				 linguagem[2]+", "+linguagem[3]+", "+linguagem[4]+"\nData do nascimento: "+
				 getNas().get(Calendar.DAY_OF_MONTH)+"/"+getNas().get(Calendar.MONTH)+
				 "/"+getNas().get(Calendar.YEAR)+"\nData de adimição: "
				 +getAdmi().get(Calendar.DAY_OF_MONTH)+"/"+(getAdmi().get(Calendar.MONTH)+1)
				 +"/"+getAdmi().get(Calendar.YEAR)+"\n";
	}
}