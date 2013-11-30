/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaOficina;

/**
 *
 * @author marcella
 */

import java.util.ArrayList;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int quilometragem;
    private String numChassi;
    private ArrayList<Acessorios> acessorios;
    private String observacoes;
    private String defeito;

    public Veiculo(String modelo, int ano, String placa, String numChassi, String defeito) {
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.numChassi = numChassi;
        this.defeito = defeito;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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

    public ArrayList<Acessorios> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(ArrayList<Acessorios> acessorios) {
        this.acessorios = acessorios;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }
    
    
}
