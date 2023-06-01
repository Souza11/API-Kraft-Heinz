package KraftHeinz.APIinsights.domain.cliente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DadosCliente(
        @NotBlank(message = "{nome.obrigatorio}")
        String nomeCliente,
        @NotBlank(message = "{email.obrigatorio}")
        @Email(message = "{email.invalido}")
        String email
) { }
