package questao3;

import questao3.Retangulo;

public class Quadrado extends Retangulo{
	
    public Quadrado (double lado) {
        super (lado, lado); 
    }

    public double getLado() {
    	
        return getAltura(); 
    }
    
    public void setLado(double lado) {
      
    	setAltura(lado); 
    	
        setLargura(lado);
    }
}