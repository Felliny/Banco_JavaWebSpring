package br.edu.fateczl.Banco.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaBancaria {
    String nome_cliente;
    int num_conta;
    float saldo;


    public void sacar(float saque){

    }

    public void depositar(float deposito){

    }
}
