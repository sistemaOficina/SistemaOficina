package SistemaOficina;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Servicos {
	
    private String descricao;
    private String regiao;
    private int quantidade;
    private double valorUnidade;
    private double valorTotal;
    private String observacao;
    
    public Servicos() {
	super();
    }
    
    public static final String PROP_DESCRICAO = "descricao";
    public static final String PROP_REGIAO = "regiao";
    public static final String PROP_QUANTIDADE = "quantidade";
    public static final String PROP_VALORUNIDADE = "valorUnidade";
    public static final String PROP_VALORTOTAL = "valorTotal";
    public static final String PROP_OBSERVACAO = "observacao";

    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        propertyChangeSupport.firePropertyChange(PROP_DESCRICAO, oldDescricao, descricao);
    }
    
    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        String oldRegiao = this.regiao;
        this.regiao = regiao;
        propertyChangeSupport.firePropertyChange(PROP_REGIAO, oldRegiao, regiao);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        int oldQuantidade = this.quantidade;
        this.quantidade = quantidade;
        propertyChangeSupport.firePropertyChange(PROP_QUANTIDADE, oldQuantidade, quantidade);
    }
    
    public double getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(double valorUnidade) {
        double oldValorUnidade = this.valorUnidade;
        this.valorUnidade = valorUnidade;
        propertyChangeSupport.firePropertyChange(PROP_VALORUNIDADE, oldValorUnidade, valorUnidade);
    }

    public double getValorTotal() {
        return valorUnidade*quantidade;
    }

    public void setValorTotal(double valorTotal) {
        double oldValorTotal = this.valorTotal;
        this.valorTotal = valorTotal;
        propertyChangeSupport.firePropertyChange(PROP_VALORTOTAL, oldValorTotal, valorTotal);
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        String oldObservacao = this.observacao;
        this.observacao = observacao;
        propertyChangeSupport.firePropertyChange(PROP_OBSERVACAO, oldObservacao, observacao);
    }
    
    public double calculaTotal(){
        valorTotal = valorUnidade * quantidade;
        return valorTotal;
    }
    
    
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
    
}
