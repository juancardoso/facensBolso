/**
 *  MARCO ANTONIO PAIVA PEREIRA 152945
 */
package com.example.juan.facensbolso;

public class Cadastro {
	
	private int id;
    private String nome;
    private String usuario;
    private String senha;
    private Model_cadastro mo_cadastro;
	
	Cadastro(int id){
        Cadastro();
        cad = this.getCadastro(id);
        if(cad){
            this.setCadastro(cad);    
        }
    }

    Cadastro(){
		this.mo_cadastro = new Model_cadastro();
	}
    
    public Object getCadastro(int id){
		return mo_cadastro.get(id);
    }
    
    public void setCadastro(Object cad){
        this.id = cad.id;
        this.nome = cad.nome;
        this.usuario = cad.usuario;
        this.senha = cad.senha;
    }
	
    public int getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }
    
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getUsuario(){
        return this.usuario;
    }

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public String getSenha(){
        return this.senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public boolean cadastrar(Cadastro cad){
         return this.mo_cadastro.add(cad);
    }

    public boolean editar(Cadastro cad){
        return this.mo_cadastro.edit(cad);
    }

    public boolean deletar(Cadastro cad){
        return this.mo_cadastro.delete(cad);
    }

    public Cadastro buscar(int id){
        return (Cadastro) this.getCadastro(id);
    }

}