package com.rafaelresck.viacep.consultacep;

public class CepResultDTO {
    private String cep;

    //trocar por rua
    //@JsonProperty("rua")
    private String logradouro;
    private String complemento;
    private String bairro;

    //trocar por cidade
    //@JsonProperty("cidade")
    private String localidade;
    private String uf;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep=cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void getLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

        public String getComplemento() {
        return complemento;
    }

    public void getComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    public String getBairro() {
        return bairro;
    }

    public void getBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public String getLocalidade() {
        return localidade;
    }

    public void getLocalidade(String localidade) {
        this.localidade = localidade;
    }
    
    public String getUf() {
        return uf;
    }

    public void getUf(String uf) {
        this.uf = uf;
    }
    
    public String getFrete() {
        return frete;
    }

    public void setFrete(String frete) {
        this.frete = frete;
    }

    private String frete;

    public double calcularFrete() {
        switch(uf) {

            
        }
    }
}
