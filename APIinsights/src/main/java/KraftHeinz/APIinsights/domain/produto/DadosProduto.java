package KraftHeinz.APIinsights.domain.produto;

import jakarta.validation.constraints.NotNull;

public record DadosProduto(
        @NotNull(message = "{especialidade.obrigatoria}")
        NomeProduto nomeProduto
) { }
