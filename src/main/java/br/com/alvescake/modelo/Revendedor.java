package br.com.alvescake.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Revendedor implements Serializable{
      
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private Integer sexo;
	private String cpf;
	private Date dataNascimento;
    private String nomeIndicante;
    private String cpfIndicante;
	
	private List<Endereco> listaEndereco=new ArrayList<Endereco>();
	
	
	public Revendedor() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Endereco> getListaEndereco() {
		return listaEndereco;
	}

	public void setListaEndereco(List<Endereco> listaEndereco) {
		this.listaEndereco = listaEndereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeIndicante() {
		return nomeIndicante;
	}

	public void setNomeIndicante(String nomeIndicante) {
		this.nomeIndicante = nomeIndicante;
	}

	public String getCpfIndicante() {
		return cpfIndicante;
	}

	public void setCpfIndicante(String cpfIndicante) {
		this.cpfIndicante = cpfIndicante;
	}

	@Override
	public String toString() {
		return "Revendedor [id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", cpf=" + cpf + ", dataNascimento="
				+ dataNascimento + ", nomeIndicante=" + nomeIndicante + ", cpfIndicante=" + cpfIndicante
				+ ", listaEndereco=" + listaEndereco + "]";
	}
}
