
package SistemaOficina;


import java.util.ArrayList;

public class Veiculo {
    private String modelo;
    private String veiculo;
    private int ano;
    private String placa;
    private int quilometragem;
    private String numChassi;
    private ArrayList<String> acessorios;
    private ArrayList<String> defeito;

  

    public Veiculo(String veiculo, int ano, String placa, String numChassi) {
        this.veiculo = veiculo;
        this.ano = ano;
        this.placa = placa;
        this.numChassi = numChassi;
      
    }
    


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(String numChassi) {
        this.numChassi = numChassi;
    }

    public ArrayList<String> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(ArrayList<String> acessorios) {
        this.acessorios = acessorios;
    }

    
    public ArrayList<String> getDefeito() {
        return defeito;
    }

    public void setDefeito(ArrayList<String> defeito) {
        this.defeito = defeito;
    }

   
    
    
}
