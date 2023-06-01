package KraftHeinz.APIinsights.domain.insight;

import KraftHeinz.APIinsights.domain.cliente.DadosCliente;
import KraftHeinz.APIinsights.domain.produto.DadosProduto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosInsight(
      @NotNull(message = "{cliente.obrigatorio}")
      DadosCliente cliente,
      @NotNull(message = "{produto.obrigatorio}")
      DadosProduto produto,
      @NotNull(message = "{especialidade.obrigatoria}")
      TipoESG tipo,
      @NotBlank(message = "{telefone.obrigatorio}")
      String proposta


) { }
