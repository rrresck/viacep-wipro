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

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

        public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
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
            case "SP":
            case "RJ":
            case "ES":
            case "MG":
                return 7.85;
            case "DF":
            case "GO":
            case "MT":
            case "MS":
                return 12.5;
            case "MA":
            case "PI":
            case "CE":
            case "RN":
            case "PE":
            case "PB":
            case "SE":
            case "AL":
            case "BA":

                return 15.98;
            case "RS":
            case "SC":
            case "PR":
                return 17.3;
            case "AC":
            case "AM":
            case "AP":
            case "PA":
            case "RO":
            case "RR":
            case "TO":
                return 20.83;
            default:
                return 0;
        }
    }
}
