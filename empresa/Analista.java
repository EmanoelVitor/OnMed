package empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Analista extends Funcionario {
	public String[] diagrama;
	
	public Analista() {
		super();
		diagrama=new String[5];
	}
	public Analista(String cpf, String nome, char sexo, double salbru,
			GregorianCalendar nas , GregorianCalendar admi, String[] diagrama) {
			this.diagrama= diagrama;
			this.setCpf(cpf);
			this.setNome(nome);
			this.setSexo(sexo);
			this.setSalbru(salbru);
			this.setAdmi(admi);
			this.setNas(nas);
		}
	public boolean dominaMesmoDiagrama(Analista a) {
		return diagrama.equals(this.diagrama);
	}
	public double getBonificacao(Funcionario f) {
		return f.getSalbru()*0.03+ f.getSalbru();
	}
	public String toString() {
		return "CPF: "+getCpf()+"\nNOME:"+getNome()+"\nGÊNERO: "+getSexo()+
				 "\nSALÁRIO: "+getSalbru()+"/Diagramas: "+diagrama[0]+", "+diagrama[1]+", "+
				 diagrama[2]+", "+diagrama[3]+", "+diagrama[4]+"\nData do nascimento: "+
				 getNas().get(java.util.Calendar.DAY_OF_MONTH)+"/"+getNas().get(Calendar.MONTH)+
				 "/"+getNas().get(Calendar.YEAR)+"\nData de adimição: "
				 +getAdmi().get(Calendar.DAY_OF_MONTH)+"/"+(getAdmi().get(Calendar.MONTH)+1)
				 +"/"+getAdmi().get(Calendar.YEAR)+"\n";
	}

}
