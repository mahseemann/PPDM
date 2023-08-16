package questao3;

public class MainForma {
	
	 public static void main(String[] args) {
	        
	        double alturaRetangulo = 5.0;
	        double larguraRetangulo = 8.0;
	        Retangulo retangulo = new Retangulo(alturaRetangulo, larguraRetangulo);

	        
	        double ladoQuadrado = 4.0;
	        Quadrado quadrado = new Quadrado(ladoQuadrado);

	        
	        double raioCirculo = 3.0;
	        Circulo circulo = new Circulo(raioCirculo);

	        
	        double areaRetangulo = retangulo.area();
	        double perimetroRetangulo = retangulo.perimetro();

	        double areaQuadrado = quadrado.area();
	        double perimetroQuadrado = quadrado.perimetro();

	        double areaCirculo = circulo.area();
	        double perimetroCirculo = circulo.perimetro();

	       
	        System.out.println("Retângulo:\n");
	        System.out.println("Área:" + areaRetangulo);
	        System.out.println("Perímetro:" + perimetroRetangulo);

	        System.out.println("\nQuadrado:\n");
	        System.out.println("Área:" + areaQuadrado);
	        System.out.println("Perímetro:" + perimetroQuadrado);

	        System.out.println("\nCírculo:\n");
	        System.out.println("Área:" + areaCirculo);
	        System.out.println("Perímetro:" + perimetroCirculo);
	    }
	}
