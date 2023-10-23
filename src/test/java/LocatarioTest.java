package test.java;
import main.java.FabricaAnual;
import main.java.FabricaMensal;
import main.java.FabricaSemanal;
import main.java.FabricaAbstrata;
import main.java.Locatario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 class LocatarioTest {

        @Test 
        void deveEmitirContratoSemanal() {
            FabricaAbstrata fabrica = new FabricaSemanal();
            Locatario Locatario = new Locatario(fabrica);
            assertEquals ("Contrato Semanal", locatario.emitirContratoSemanal());
        }

         @Test 
        void deveEmitirContratoMensal() {
            FabricaAbstrata fabrica = new FabricaMensal();
            Locatario Locatario = new Locatario(fabrica);
            assertEquals ("Contrato Mensal", locatario.emitirContratoMensal());
        }

         @Test 
        void deveEmitirContratoAnual() {
            FabricaAbstrata fabrica = new FabricaAnual();
            Locatario Locatario = new Locatario(fabrica);
            assertEquals ("Contrato Semanal", locatario.emitirContratoAnual());
        }
}

