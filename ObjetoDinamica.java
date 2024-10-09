package dinamicaCI;

public class ObjetoDinamica {

	private String Marca;
	private String Cor;
	private String Tamanho;
	private String Embalagem;
	private String Formato;
	private String Palito;
	
	public ObjetoDinamica(String Marca, String Cor, String Tamanho, String Embalagem, String Formato) {
		this.Marca = Marca;
		this.Cor = Cor;
		this.Tamanho = Tamanho;
		this.Embalagem = Embalagem;
		this.Formato = Formato;
	}
	
	public ObjetoDinamica(String Marca, String Cor, String Tamanho, String Embalagem, String Formato, String Palito) {
		this.Marca = Marca;
		this.Cor = Cor;
		this.Tamanho = Tamanho;
		this.Embalagem = Embalagem;
		this.Formato = Formato;
		this.Palito = Palito;
	}
	
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String Marca) {
		this.Marca = Marca;
	}
	
	public String getCor() {
		return Cor;
	}
	public void setCor(String Cor) {
		this.Cor = Cor;
	}
	
	public String getTamanho() {
		return Tamanho;
	}
	public void setTamanho(String Tamanho) {
		this.Tamanho = Tamanho;
	}
	
	public String getEmbalagem() {
		return Embalagem;
	}
	public void setEmbalagem(String Embalagem) {
		this.Embalagem = Embalagem;
	}
	
	public String getFormato() {
		return Formato;
	}
	public void setFormato(String Formato) {
		this.Formato = Formato;
	}
	
	public String getPalito() {
		return Palito;
	}
	public void setPalito(String Palito) {
		this.Palito = Palito;
	}
	

	
}
