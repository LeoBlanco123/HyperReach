package br.com.fiap.challenge3.model;

import lombok.Getter;

@Getter
public enum OpcoesContrato {
    SIM("opcoesContrato.sim"),
    NAO("opcoesContrato.nao");

    private final String descricao;

    OpcoesContrato(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}


