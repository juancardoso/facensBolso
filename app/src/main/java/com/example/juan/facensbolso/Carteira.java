/**
 * 
 */
package com.example.juan.facensbolso;

import java.awt.Color;
import java.util.ArrayList;

public class Carteira {
	
	int id;
	int idcadastro;
	String tipo;
	String nome;
	Color cor;
	double saldo;
	ArrayList<Movimentacao> movimentacao = new ArrayList<Movimentacao>();
	
	Carteira(int idcadastro){
		this.idcadastro = idcadastro;
	}
	
	Carteira(){
		
	}
	
	public boolean cadastrar(){
		return false;
		
	}
	
	public boolean editar(){
		return false;
		
	}
	
	public boolean deletar(){
		return false;
		
	}
	
	public void addMovimentacao(Movimentacao movimento){
		movimentacao.add(movimento);
	}
	
	public void getMovimentacao(int index){
		movimentacao.get(index);
	}

	public void deleteMovimentacao(int index){
		movimentacao.remove(index);
	}
	
	public ArrayList<Movimentacao> buscarMovimentacao(String busca){
		ArrayList<Movimentacao> encontrados = new ArrayList<Movimentacao>();
		for (Movimentacao movimento : movimentacao) {
			if(busca.equalsIgnoreCase(movimento.getDescricao())){
				encontrados.add(movimento);
			}
		}
		return encontrados;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdcadastro() {
		return idcadastro;
	}

	public void setIdcadastro(int idcadastro) {
		this.idcadastro = idcadastro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
