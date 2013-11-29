package SistemaOficina;

public class Servicos {
	
	private String descricao;
	private String regiao;
	private int quantidade;
	private double valorUnidade;
	private double valorTotal;
	private String obs;
	
	public Servicos(String descricao, String tipo, int quantidade,
			double valorUnidade) {
		super();
		this.descricao = descricao;
		this.regiao = tipo;
		this.quantidade = quantidade;
		this.valorUnidade = valorUnidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return regiao;
	}

	public void setTipo(String tipo) {
		this.regiao = tipo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorUnidade() {
		return valorUnidade;
	}

	public void setValorUnidade(double valorUnidade) {
		this.valorUnidade = valorUnidade;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}
	
	public void calculaValorTotal() {
		
		valorTotal = quantidade * valorUnidade;
	}
	
	
	

}
