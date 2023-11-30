package ada.tech.tenthirty.tvpackages.service;

import ada.tech.tenthirty.tvpackages.exceptions.PromocaoNaoCriadaException;
import ada.tech.tenthirty.tvpackages.model.Promocao;
import ada.tech.tenthirty.tvpackages.payloads.PromocaoRequest;
import ada.tech.tenthirty.tvpackages.payloads.PromocaoResponse;
import ada.tech.tenthirty.tvpackages.repository.PromocaoRepository;
import ada.tech.tenthirty.tvpackages.utils.PromocaoConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PromocaoService {

    @Autowired
    PromocaoRepository repository;

    public PromocaoResponse savePromocao(PromocaoRequest promocaoRequest) {
        try {
            Promocao promocaoEntity = repository.save(PromocaoConvert.toEntity(promocaoRequest));
            System.out.println("Promoção incluída com sucesso.");
            return PromocaoConvert.toResponse(promocaoEntity);
        } catch (Exception e) {
            throw new PromocaoNaoCriadaException("Não foi possível criar a promoção.", e);
        }
    }

    public List<PromocaoResponse> getPromocoes() {
        List<Promocao> promocoes = repository.findAll();

        if (promocoes.isEmpty()) {
            System.out.println("Nenhuma promoção encontrada.");
            return List.of();
        }
        return PromocaoConvert.toResponseList(promocoes);
    }

    public ResponseEntity<Integer> getPromocaoByPacoteId(String pacoteId) {
        Optional<Promocao> promocao = repository.findByPacoteId(pacoteId);

        if (promocao.isPresent()) {
            Integer desconto = promocao.get().getDesconto();
            System.out.println("Desconto de "+ desconto +"% aplicado ao pacote id " + pacoteId);
            return ResponseEntity.ok(desconto);
        } else {
            System.out.println("Não há promoções cadastradas para o pacote id " + pacoteId);
            return ResponseEntity.ok(0);
        }

    }


}
