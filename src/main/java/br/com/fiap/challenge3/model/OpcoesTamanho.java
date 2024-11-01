package br.com.fiap.challenge3.model;

import lombok.Getter;

@Getter
public enum OpcoesTamanho {
    MICRO("tamanho.micro"),
    PEQUENO("tamanho.pequeno"),
    MEDIO("tamanho.medio"),
    GRANDE("tamanho.grande"),
    MULTINACIONAL("tamanho.multinacional");

    private final String messageKey;

    OpcoesTamanho(String messageKey) {
        this.messageKey = messageKey;
    }

    @Override
    public String toString() {
        return messageKey;
    }
}
