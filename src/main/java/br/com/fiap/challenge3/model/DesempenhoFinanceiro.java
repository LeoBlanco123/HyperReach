package br.com.fiap.challenge3.model;

import jakarta.persistence.*;
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
public class DesempenhoFinanceiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @PositiveOrZero(message = "{desempenho.receita.positive}")
    @NotNull(message = "{desempenho.receita.notNull}")
    private Double receita;

    @PositiveOrZero(message = "{desempenho.lucro.positive}")
    @NotNull(message = "{desempenho.lucro.notNull}")
    private Double lucro;

    @DecimalMin(value = "0.0", inclusive = true, message = "{desempenho.crescimento.min}")
    @DecimalMax(value = "100.0", inclusive = true, message = "{desempenho.crescimento.max}")
    @NotNull(message = "{desempenho.crescimento.notNull}")
    private Double crescimento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa")
    private Empresas empresa;
}