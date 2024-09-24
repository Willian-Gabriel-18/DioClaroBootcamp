package edu.will.conjunto;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> listaConvidados;

    public ConjuntoConvidados(){
        listaConvidados = new HashSet<>();
    }

    /*
    *adicionarConvidado(String nome, int codigoConvite): Adiciona um convidado ao conjunto.
    *removerConvidadoPorCodigoConvite(int codigoConvite): Remove um convidado do conjunto com base no código do convite.
    *contarConvidados(): Conta o número total de convidados no Set.
    *exibirConvidados(): Exibe todos os convidados do conjunto.
    */

    public void adicionarConvidado(String nome, int codigoConvite){
        listaConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoRemovido = null;
        if(!listaConvidados.isEmpty()){
            for(Convidado c: listaConvidados){
                if(c.getCodigoConvite() == codigoConvite){
                    convidadoRemovido = c;
                    break;
                }
            }
            listaConvidados.remove(convidadoRemovido);
        }
        else{
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public int contarConvidados(){
        return listaConvidados.size();
    }

    public void exibirConvidados(){
        System.out.println(listaConvidados);
    }



}
