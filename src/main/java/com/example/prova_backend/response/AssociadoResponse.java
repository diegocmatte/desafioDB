package com.example.prova_backend.response;

public class AssociadoResponse {

    private String nroCoop;
    private String nroConta;
    private String saldo;
    private String status;
    private boolean resposta;

    public AssociadoResponse(String nroCoop, String nroConta, String saldo, String status, boolean resposta) {
        this.nroCoop = nroCoop;
        this.nroConta = nroConta;
        this.saldo = saldo;
        this.status = status;
        this.resposta = resposta;
    }

    public String getNroCoop() {
        return nroCoop;
    }

    public void setNroCoop(String nroCoop) {
        this.nroCoop = nroCoop;
    }

    public String getNroConta() {
        return nroConta;
    }

    public void setNroConta(String nroConta) {
        this.nroConta = nroConta;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isResposta() {
        return resposta;
    }

    public void setResposta(boolean resposta) {
        this.resposta = resposta;
    }
}
