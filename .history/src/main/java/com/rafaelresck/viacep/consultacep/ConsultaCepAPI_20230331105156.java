package com.rafaelresck.viacep.consultacep;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("consulta-cep")
public class ConsultaCepAPI {
    @GetMapping("{cep}")
    public CepResultDTO consultCep(@PathVariable("cep") String cep) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CepResultDTO> resp = respTemplate.getForEntity(
                String.format("https://viacep.com.br/ws/%s/json/", cep), CepResultDTO.class);
        CepResultDTO cepResultDTO = resp.getBody();
        if (cepResultDTO == null) {
            throw new RuntimeException("CEP não encontrado");
        }
        double frete = cepResultDTO.calcularFrete();
        cepResultDTO.setFrete(String.format("%.2f", frete));
        cepResultDTO.setLocalidade(cepResultDTO.getLocalidade());
        cepResultDTO.setLogradouro(cepResultDTO.getLogradouro());
        return cepResultDTO;
    }
    
}
