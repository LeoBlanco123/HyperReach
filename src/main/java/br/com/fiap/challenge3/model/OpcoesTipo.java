package br.com.fiap.challenge3.model;

import lombok.Getter;

@Getter
public enum OpcoesTipo {
    SOCIEDADE_EMPRESARIA_LIMITADA("tipo.empresa.sociedade_limitada"),
    MICROEMPREENDEDOR_INDIVIDUAL("tipo.empresa.microempreendedor_individual"),
    SOCIEDADE_LIMITADA_UNIPESSOAL("tipo.empresa.sociedade_limitada_unipessoal"),
    SOCIEDADE_ANONIMA("tipo.empresa.sociedade_anonima"),
    EMPRESARIO_INDIVIDUAL("tipo.empresa.empresario_individual"),
    SOCIEDADE_SIMPLES("tipo.empresa.sociedade_simples");

    private final String descricao;

    OpcoesTipo(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
