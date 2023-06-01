package KraftHeinz.APIinsights.domain.insight;

import KraftHeinz.APIinsights.domain.cliente.Cliente;
import KraftHeinz.APIinsights.domain.produto.Produto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Insight")
@Table(name = "Insights")
public class Insight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Embedded
    private Cliente cliente;

    @Embedded
    private Produto produto;
    @Enumerated(EnumType.STRING)
    private TipoESG tipo;
    private String proposta;

    public Insight(DadosInsight dados){
        this.cliente = new Cliente(dados.cliente());
        this.produto = new Produto(dados.produto());
        this.tipo = dados.tipo();
        this.proposta = dados.proposta();
    }




}
