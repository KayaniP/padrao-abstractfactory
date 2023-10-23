package main.java;

public class FabricaAnual implements FabricaAbstrata {

    @Override
    public Contrato createContrato(){
        return new ContratoAnual(); 
    }
    
    @Override
    public Historico createHistorico(){
        return new HistoricoAnual();
    }
} 

//Override - uma forma de garantir que você está sobrescrevendo um método e não criando um novo