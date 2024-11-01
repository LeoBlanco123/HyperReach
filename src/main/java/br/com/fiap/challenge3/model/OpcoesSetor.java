package br.com.fiap.challenge3.model;

import lombok.Getter;

@Getter
public enum OpcoesSetor {
    COMERCIAL("setor.comercial"),
    INDUSTRIAL("setor.industrial"),
    RURAL("setor.rural"),
    SERVIÇOS("setor.servicos"),
    OUTROS("setor.outros");

    private final String messageKey;

    OpcoesSetor(String messageKey) {
        this.messageKey = messageKey;
    }

    @Override
    public String toString() {
        return messageKey;
    }
}
