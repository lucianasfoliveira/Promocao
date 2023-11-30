package ada.tech.tenthirty.tvpackages.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "promocao")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Promocao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer promocaoId;

    private String pacoteId;
    private Integer desconto;



}
