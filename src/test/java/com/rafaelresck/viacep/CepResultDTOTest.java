package com.rafaelresck.viacep;
import com.rafaelresck.viacep.consultacep.CepResultDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CepResultDTOTest {
    @Test
    void testCalcularFreteSP() {
        CepResultDTO cepResultDTO = new CepResultDTO();
        cepResultDTO.setUf("SP");
        double frete = cepResultDTO.calcularFrete();
        Assertions.assertEquals(7.85, frete);
    }

    @Test
    void testCalcularFretePI() {
        CepResultDTO cepResultDTO = new CepResultDTO();
        cepResultDTO.setUf("PI");
        double frete = cepResultDTO.calcularFrete();
        Assertions.assertEquals(15.98, frete);
    }

    @Test
    void testCalcularFretePA() {
        CepResultDTO cepResultDTO = new CepResultDTO();
        cepResultDTO.setUf("PA");
        double frete = cepResultDTO.calcularFrete();
        Assertions.assertEquals(20.83, frete);
    }

    @Test
    void testCalcularFreteGO() {
        CepResultDTO cepResultDTO = new CepResultDTO();
        cepResultDTO.setUf("GO");
        double frete = cepResultDTO.calcularFrete();
        Assertions.assertEquals(12.50, frete);
    }
    @Test
    void testCalcularFreteRS() {
        CepResultDTO cepResultDTO = new CepResultDTO();
        cepResultDTO.setUf("RS");
        double frete = cepResultDTO.calcularFrete();
        Assertions.assertEquals(17.30, frete);
    }

    @Test
    void testSetCepNordeste() {
        CepResultDTO cepResultDTO = new CepResultDTO();
        cepResultDTO.setCep("64016-840");
        Assertions.assertEquals("64016-840", cepResultDTO.getCep());
    }

    @Test
    void testSetCepSudeste() {
        CepResultDTO cepResultDTO = new CepResultDTO();
        cepResultDTO.setCep("05001-200");
        Assertions.assertEquals("05001-200", cepResultDTO.getCep());
    }

    @Test
    void testSetCepSul() {
        CepResultDTO cepResultDTO = new CepResultDTO();
        cepResultDTO.setCep("90251-903");
        Assertions.assertEquals("90251-903", cepResultDTO.getCep());
    }

    @Test
    void testSetCepCentroeste() {
        CepResultDTO cepResultDTO = new CepResultDTO();
        cepResultDTO.setCep("78030-210");
        Assertions.assertEquals("78030-210", cepResultDTO.getCep());
    }

    @Test
    void testSetCepNorte() {
        CepResultDTO cepResultDTO = new CepResultDTO();
        cepResultDTO.setCep("66093-082");
        Assertions.assertEquals("66093-082", cepResultDTO.getCep());
    }
}
