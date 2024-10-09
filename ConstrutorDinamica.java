package dinamicaCI;

public class ConstrutorDinamica {

	public static void main(String[] args) {
		
		ObjetoDinamica D1 = new ObjetoDinamica("7Belo", "Rosa", "Pequeno","Sim","Paralelepipedo");
		ObjetoDinamica D2 = new ObjetoDinamica("Big Big", "Vermelho", "Pequeno","Sim","Esfera","Sim");
		ObjetoDinamica D3 = new ObjetoDinamica("Garoto", "Marrom", "Médio","Não","Retangulo");
		ObjetoDinamica D4 = new ObjetoDinamica("Mescladon", "Branco", "Médio","Não","Paralelepipedo", "Sim");
		
		System.out.println(D1.getMarca());
		System.out.println(D1.getCor());
		System.out.println(D1.getTamanho());
		System.out.println(D1.getEmbalagem());
		System.out.println(D1.getFormato());
		
		System.out.println(D2.getMarca());
		System.out.println(D2.getCor());
		System.out.println(D2.getTamanho());
		System.out.println(D2.getEmbalagem());
		System.out.println(D2.getFormato());
		
		System.out.println(D3.getMarca());
		System.out.println(D3.getCor());
		System.out.println(D3.getTamanho());
		System.out.println(D3.getEmbalagem());
		System.out.println(D3.getFormato());
		
		System.out.println(D4.getMarca());
		System.out.println(D4.getCor());
		System.out.println(D4.getTamanho());
		System.out.println(D4.getEmbalagem());
		System.out.println(D4.getFormato());
		


	}

}
