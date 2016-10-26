package br.com.tt.model;

import java.time.LocalDate;

/** Classe modelo Pet para manter os bixos.
 * @author Mauro Rilho
 *
 */
public class Petes {

  private Long id;
  private String nome;
  private LocalDate dataNasc;
  private String raca;
  private String cor;
 
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

  public LocalDate getDataNasc() {
    return dataNasc;
  }

  public void setDataNasc(LocalDate dataNasc) {
    this.dataNasc = dataNasc;
  }

  public String getRaca() {
    return raca;
  }

  public void setRaca(String raca) {
    this.raca = raca;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public Petes() {
    super();
    // TODO Auto-generated constructor stub
  }

  
  
}
