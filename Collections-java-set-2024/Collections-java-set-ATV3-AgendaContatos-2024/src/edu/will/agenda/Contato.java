package edu.will.agenda;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numeroTelefone;

    public Contato(String nome, int numeroTelefone){
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Contato contato)) return false;
      return Objects.equals(getNome(), contato.getNome());
    }
  
    @Override
    public int hashCode() {
      return Objects.hash(getNome());
    }

    @Override
    public String toString() {
        return "Contato\n{nome =" + nome + "}\n{numeroTelefone = " + numeroTelefone + "}\n";
    }
    
    
}
