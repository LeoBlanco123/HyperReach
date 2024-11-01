package br.com.fiap.challenge3.model;

import lombok.Getter;

@Getter
public enum OpcoesRecursos {
    SIM("opcoesRecursos.sim"),
    NAO("opcoesRecursos.nao");

    private final String chave;

    OpcoesRecursos(String chave) {
        this.chave = chave;
    }

    @Override
    public String toString() {
        return chave; // opcional, dependendo do uso
    }
}
