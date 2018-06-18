package formais;

import java.util.HashMap;
import java.util.HashSet;

public class GLC {

	private HashSet<Character> naoterminal;
	private HashSet<Character> terminal;
	private HashMap<Character, HashSet<String>> producao;
	private char inicial;
	
	public GLC(HashSet<Character> naoterminal,HashSet<Character> terminal,HashMap<Character, HashSet<String>> producao,char inicial) {
		this.naoterminal = naoterminal;
		this.terminal = terminal;
		this.producao = producao;
		this.inicial = inicial;
	}
	
	public HashSet<Character> getNaoterminal() {
		return naoterminal;
	}
	public void setNaoterminal(HashSet<Character> naoterminal) {
		this.naoterminal = naoterminal;
	}
	public HashSet<Character> getTerminal() {
		return terminal;
	}
	public void setTerminal(HashSet<Character> terminal) {
		this.terminal = terminal;
	}
	public HashMap<Character, HashSet<String>> getProducao() {
		return producao;
	}
	public void setProducao(HashMap<Character, HashSet<String>> producao) {
		this.producao = producao;
	}
	public char getInicial() {
		return inicial;
	}
	public void setInicial(char inicial) {
		this.inicial = inicial;
	}

	public boolean verificarFinitude() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verificarVazia() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean ehFatorada() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean ehFatoravelNPassos() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object getGLCNaoRecursiva() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean temRecursaoEsquerda() {
		// TODO Auto-generated method stub
		return false;
	}

	public HashSet<Character> getNTerminaisRecursivos() {
		// TODO Auto-generated method stub
		return null;
	}

	public HashSet<String> getTipoDeRecursao() {
		// TODO Auto-generated method stub
		return null;
	}

	public String calcularFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	public String calcularFollow() {
		// TODO Auto-generated method stub
		return null;
	}

	public String calcularFirstNT() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
