package edis.project.rest.models.entities.ibge;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RegiaoImediata {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("regiao-intermediaria")
    private RegiaoIntermediaria regiaoIntermediaria;
}
