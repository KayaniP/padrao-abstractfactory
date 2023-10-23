package main.java;

public class FabricaMensal implements FabricaAbstrata {

    @Override
    public Contrato createContrato(){
        return new ContratoMensal(); 
    }
    
    @Override
    public Historico createHistorico(){
        return new HistoricoMensal();
    }
} 
