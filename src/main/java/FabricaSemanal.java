package main.java;

public class FabricaSemanal implements FabricaAbstrata {

    @Override
    public Contrato createContrato(){
        return new ContratoSemanal(); 
    }
    
    @Override
    public Historico createHistorico(){
        return new HistoricoSemanal();
    }
}
