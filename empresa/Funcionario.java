package empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Funcionario {
	private String cpf;
	private String nome;
	private char sexo;
	private double salbru;
	private GregorianCalendar admi= new GregorianCalendar();
	private GregorianCalendar nas= new GregorianCalendar();
	
	Calendar c = Calendar.getInstance();
	public Funcionario() {
		int ano=c.get(Calendar.YEAR);
		int mes=c.get(Calendar.MONTH);
		int dia=c.get(Calendar.DAY_OF_MONTH);
		admi.set(ano,mes,dia);
	}
	
	public Funcionario(String cpf, String nome, GregorianCalendar admi) {
		this.cpf= cpf;
		this.nome = nome;
		this.admi = admi;
	}
	
	public Funcionario(String cpf, String nome, char sexo, double salbru,
	GregorianCalendar nas , GregorianCalendar admi) {
		this.cpf= cpf;
		this.nome = nome;
		this.sexo = sexo;
		this.salbru = salbru;
		this.admi = admi;
		this.nas = nas;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getSalbru() {
		return salbru;
	}

	public void setSalbru(double salbru) {
		this.salbru = salbru;
	}
	
	public GregorianCalendar getNas() {
		return nas;
	}
	
	public void setNas(GregorianCalendar nas) {
		this.nas=nas;
	}
	
	public GregorianCalendar getAdmi() {
		return admi;
	}
	
	public void setAdmi(GregorianCalendar admi) {
		this.admi=admi;
	}
	
	public boolean validarCPF(String cpf) {
		boolean vcpf = true;
		if(cpf.length()<14) {
			vcpf = false;
		}
		return vcpf;
	}
	
	public boolean validarAnoNas(GregorianCalendar nas) {
		boolean vannas = true;
		int yearnas = nas.get(Calendar.YEAR);
		if(yearnas<1920) {
			vannas = false;
		}
		return vannas;
	 }
	 
	public boolean validarAnoAdmi(GregorianCalendar admi) {
		 boolean vanad = true;
		 int yearnas = admi.get(Calendar.YEAR);
		 if(yearnas<1995) {
			 vanad = false;
		 }
		 return vanad;
		}
	 
	 public int returnIdade(int nas) {
		 int anoatu =c.get(Calendar.YEAR);
		 int idade= anoatu -nas;
		 return idade;
	 }
	 public double SalLiq(double salbru) {
		 double salliq;
		 if (salbru<=3000000) {
			 salliq = salbru - (salbru*0.17); 
		 } else {
			 salliq = salbru - (salbru*0.27);
		 }
		 return salliq;
	 }
	 
	 public String toString() {
		 return "CPF: "+cpf+"\nNOME:"+nome+"\nGÊNERO: "+sexo+
				 "\nSALÁRIO: "+salbru+"\nData do nascimento: "+
				 nas.get(Calendar.DAY_OF_MONTH)+"/"+nas.get(Calendar.MONTH)+
				 "/"+nas.get(Calendar.YEAR)+"\nData de adimição: "
				 +admi.get(Calendar.DAY_OF_MONTH)+"/"+(admi.get(Calendar.MONTH)+1)
				 +"/"+admi.get(Calendar.YEAR)+"\n";
	 }
	 public void Equals(Funcionario[] f) {
		 for(int i=0;i<f.length;i++) {
			  for(int j=i+1;j<f.length;j++) {
				 if(f[j].nome.equals(f[i].nome)&&f[j].cpf.equals(f[i].cpf)&&
				 f[j].sexo==f[i].sexo) {
					 System.out.println("O funcionário "+i+
					 " é igual ao funcionário "+j);
				 }
			 }
		 }
	 }
		public double getBonificacao(Funcionario f) {
		getSalbru();
		double boni = salbru+(salbru * 0.02);
		return boni;
	}
	public boolean dataAposentadoria(GregorianCalendar admi, char sexo) {
		int anoatu = c.get(Calendar.YEAR);
		int apo= anoatu-admi.get(Calendar.YEAR);
		boolean dataapo = true;
		if(sexo=='m'||sexo=='M'&& apo==35) {
			dataapo = true;
		}else if(sexo=='m'||sexo=='M'&& apo<35) {
			dataapo = false;
		}
		if(sexo=='f'||sexo=='F'&& apo==30) {
			dataapo = true;
		}else if(sexo=='f'||sexo=='F'&& apo<30) {
			dataapo = false;
		}
		return  dataapo;
	}
	public boolean eMaisVelho(Funcionario f) {
		return returnIdade(f.nas.get(Calendar.YEAR))<returnIdade(this.nas.get(Calendar.YEAR));
	}
}