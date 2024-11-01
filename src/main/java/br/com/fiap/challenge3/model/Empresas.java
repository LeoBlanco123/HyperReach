package br.com.fiap.challenge3.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class Empresas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 4, max = 255, message = "{empresa.nome.size}")
    @NotEmpty(message = "{empresa.nome.notEmpty}")
    private String nome;

    @Enumerated(EnumType.STRING)
    private OpcoesTamanho tamanho;

    @Enumerated(EnumType.STRING)
    private OpcoesSetor setor;

    @NotEmpty(message = "{empresa.loc.notEmpty}")
    private String localizacaoGeografica;

    @PositiveOrZero(message = "{empresa.numFun.positive}")
    @NotNull(message = "{empresa.numFun.notEmpty}")
    private Integer numeroFuncionarios;

    @Enumerated(EnumType.STRING)
    private OpcoesTipo tipoEmpresa;

    private Boolean cliente;

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TendenciasGastos> tendencias = new ArrayList<>();

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DesempenhoFinanceiro> desempenhos = new ArrayList<>();

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HistoricoInteracoes> historicos;

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ComportamentoNegocios> comportamentos = new ArrayList<>();
}