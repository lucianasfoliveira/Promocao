package ada.tech.tenthirty.tvpackages.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class PromocaoResponse {
    public Integer promocaoId;
    public String pacoteId;
    public Integer desconto;


    public PromocaoResponse(Integer desconto) {
        this.desconto = desconto;
    }
}
