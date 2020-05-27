package javaapp;

public class Pais {
private String nome;
	private int idDD;
	private ArrayList<Estado> listaEstados = new ArrayList<>();

	public Pais(String nome, int codDDI) {
		this.nome = nome;
		this.codDDI = idDD;
	}

	public String getNome() {
		return nome;
	}

	public int getidDD() {
		return idDD;
	}

	public void addEstado(Estado e) {
		for (Estado estadoEncontrado : listaEstados) {
			if (estadoEncontrado.getSigla().equals(e.getSigla())) {
				return;
			}
		}
		listaEstados.add(e);
	}

	public ArrayList<Estado> getEstados() {
		return listaEstados;
	}

	public int contarEstados() {
		return listaEstados.size();
	}

}
