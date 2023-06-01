package KraftHeinz.APIinsights.domain.produto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    private NomeProduto nomeProduto;
    private boolean ativo;

    public Produto(DadosProduto dados){
        this.nomeProduto = dados.nomeProduto();
        this.ativo = true;

    }

}
