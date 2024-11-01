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
public class ComportamentoNegocios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "{comportamento.interacoes.notNull}")
    @PositiveOrZero(message = "{comportamento.interacoes.positive}")
    private Long interacoesPlataforma;

    @Min(value = 0, message = "{comportamento.frequencia.min}")
    @Max(value = 10, message = "{comportamento.frequencia.max}")
    @NotNull(message = "{comportamento.frequencia.notNull}")
    private Long frequenciaUso;

    @NotBlank(message = "{comportamento.feedback.notBlank}")
    private String feedback;

    @Enumerated(EnumType.STRING)
    private OpcoesRecursos usoRecursosEspecificos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa")
    private Empresas empresa;
}