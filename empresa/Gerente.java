package empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Gerente extends Funcionario{
	public String[] metodologia_desenvolvimento;
	
	public Gerente() {
		super();
		metodologia_desenvolvimento= new String[5];
	}
	public Gerente(String cpf, String nome, char sexo, double salbru,
		GregorianCalendar nas , GregorianCalendar admi, String[] metodologia_desenvolvimento) {
		this.metodologia_desenvolvimento=metodologia_desenvolvimento;
		this.setCpf(cpf);
		this.setNome(nome);
		this.setSexo(sexo);
		this.setSalbru(salbru);
		this.setAdmi(admi);
		this.setNas(nas);
	}
	public boolean dominaMesmasMetodologias(Gerente g) {
		return metodologia_desenvolvimento.equals(this.metodologia_desenvolvimento);
	}
	public double getBonificacao(Funcionario f) {
		return f.getSalbru()*0.05+f.getSalbru();
	}
	public String toString() {
		return "CPF: "+getCpf()+"\nNOME:"+getNome()+"\nGÊNERO: "+getSexo()+
				 "\nSALÁRIO: "+getSalbru()+"/Metodologias: "+metodologia_desenvolvimento[0]+", "
				 +metodologia_desenvolvimento[1]+", "+metodologia_desenvolvimento[2]+", "
				 +metodologia_desenvolvimento[3]+", "+metodologia_desenvolvimento[4]+
				 "\nData do nascimento: "+getNas().get(Calendar.DAY_OF_MONTH)+"/"
				 +getNas().get(Calendar.MONTH)+"/"+getNas().get(Calendar.YEAR)+"\nData de adimição: "
				 +getAdmi().get(Calendar.DAY_OF_MONTH)+"/"+(getAdmi().get(Calendar.MONTH)+1)
				 +"/"+getAdmi().get(Calendar.YEAR)+"\n";
	}

}
