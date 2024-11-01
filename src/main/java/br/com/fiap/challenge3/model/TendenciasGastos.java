package br.com.fiap.challenge3.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class TendenciasGastos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Min(value = 1900, message = "{tendencia.ano.min}")
    @Max(value = 2025, message = "{tendencia.ano.max}")
    @NotNull(message = "{tendencia.ano.notNull}")
    private Integer ano;

    @PositiveOrZero(message = "{tendencia.gastoMarketing.positive}")
    @NotNull(message = "{tendencia.gastoMarketing.notNull}")
    private Double gastoMarketing;

    @PositiveOrZero(message = "{tendencia.gastoAutomacao.positive}")
    @NotNull(message = "{tendencia.gastoAutomacao.notNull}")
    private Double gastoAutomacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa")
    private Empresas empresa;
}