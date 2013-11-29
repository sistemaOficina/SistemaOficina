package SistemaOficina;

public class Servicos {
	
	private String descricao;
	private String tipo;
	private double quantidade;
	private double valorUnidade;
	private double valorTotal;
	private String obs;
	
	public Servicos(String descricao, String tipo, double quantidade,
			double valorUnidade, double valorTotal, String obs) {
		super();
		this.descricao = descricao;
		this.tipo = tipo;
		this.quantidade = quantidade;
		this.valorUnidade = valorUnidade;
		this.valorTotal = valorTotal;
		this.obs = obs;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
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
	
	
	

}
