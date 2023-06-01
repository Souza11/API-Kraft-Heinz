package KraftHeinz.APIinsights.domain.insight;

import KraftHeinz.APIinsights.domain.cliente.Cliente;
import KraftHeinz.APIinsights.domain.produto.Produto;

public record DadosPaginaInsight(Long id, Cliente cliente, Produto produto, TipoESG tipo, String proposta) {

    public DadosPaginaInsight(Insight insight){
        this(insight.getId(),insight.getCliente(),insight.getProduto(),insight.getTipo(), insight.getProposta());
    }

}
