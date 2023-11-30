package ada.tech.tenthirty.tvpackages.controller;

import ada.tech.tenthirty.tvpackages.payloads.PromocaoRequest;
import ada.tech.tenthirty.tvpackages.payloads.PromocaoResponse;
import ada.tech.tenthirty.tvpackages.service.PromocaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="promocao")
public class PromocaoController {

    @Autowired
    PromocaoService promocaoService;

    @PostMapping
    private ResponseEntity<PromocaoResponse> criarPromocao(@RequestBody PromocaoRequest promocaoRequest) {
       PromocaoResponse promocao = promocaoService.savePromocao(promocaoRequest);
       return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    private List<PromocaoResponse> listarPromocoes(){
        return promocaoService.getPromocoes();
    }

    @GetMapping("/{pacoteId}")
    public ResponseEntity<Integer> getPromocaoByPacoteId(@PathVariable String pacoteId){

        return promocaoService.getPromocaoByPacoteId(pacoteId);

    }

}