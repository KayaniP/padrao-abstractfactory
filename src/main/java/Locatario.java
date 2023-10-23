package main.java;

public class Locatario {

    private Contrato contrato;
    private Historico historico;

    public Locatario (FabricaAbstrata fabrica){ 
        this.contrato = fabrica.createContrato();
        this.historico = fabrica.createHistorico();
    }

    public String emitirContrato(){
        return this.contrato.emitir();
    }
    public String emmitirHistorico(){
        return this.historico.emitir();
    }
} 