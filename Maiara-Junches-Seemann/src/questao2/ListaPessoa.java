package questao2;

import java.util.ArrayList;

import questao2.Pessoa;

public class ListaPessoa {
	
private ArrayList<Pessoa> listaPessoa;

    
    public ListaPessoa() {
    	listaPessoa = new ArrayList<>();
    }
    public void adicionarPessoa(Pessoa pessoa) {
    	listaPessoa.add(pessoa);
    }
    public ArrayList<Pessoa> getListaPessoa() {
        return listaPessoa;
    }
}
