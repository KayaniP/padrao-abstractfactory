package main.java;

public interface  FabricaAbstrata {
    Contrato createContrato();
    Historico createHistorico();
}

//interface - obrigar a um determinado grupo de classes a ter métodos ou propriedades em comum para existir em um determinado contexto