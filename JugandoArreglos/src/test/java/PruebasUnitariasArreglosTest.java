/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

/*Prueba 2*/

import com.mycompany.jugandoarreglos.OperacionesArreglos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Hiram
 */
public class PruebasUnitariasArreglosTest {
    
    public PruebasUnitariasArreglosTest() {
        
    }
    
    private OperacionesArreglos opa;
    
    @BeforeEach
    public void setUp() throws Exception {
        opa = new OperacionesArreglos();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void pruebaSuma1(){
	float[] entrada= {10f,15f,10f};
	float salidaEsperada=35f;
        
        float salidaReal=opa.calcularSuma(entrada);
        
        assertEquals(salidaEsperada,salidaReal);
}

    @Test
    public void pruebaSuma2nulo(){
	float[] entrada= null;
	float salidaEsperada=0f;
        
        float salidaReal=opa.calcularSuma(entrada);
        
        assertEquals(salidaEsperada,salidaReal);
    }
    
        // -------------------------
    // 5.2 Promedio
    // -------------------------

    @Test
    public void pruebaPromedioNormal() {
        float[] entrada = {10f, 20f, 30f};
        float salidaEsperada = 20f;

        float salidaReal = opa.calcularPromedio(entrada);

        assertEquals(salidaEsperada, salidaReal, 0.0001f);
    }

    @Test
    public void pruebaPromedioArregloVacio() {
        float[] entrada = {};
        float salidaEsperada = 0f;

        float salidaReal = opa.calcularPromedio(entrada);

        assertEquals(salidaEsperada, salidaReal, 0.0001f);
    }

    // -------------------------
    // 5.3 Mayores que un límite
    // -------------------------

    @Test
    public void pruebaContarMayoresQue() {
        float[] entrada = {5f, 10f, 15f, 20f};
        float limite = 12f;
        int salidaEsperada = 2;

        int salidaReal = opa.contarMayoresQue(entrada, limite);

        assertEquals(salidaEsperada, salidaReal);
    }

    @Test
    public void pruebaContarMayoresQueNinguno() {
        float[] entrada = {1f, 2f, 3f};
        float limite = 5f;
        int salidaEsperada = 0;

        int salidaReal = opa.contarMayoresQue(entrada, limite);

        assertEquals(salidaEsperada, salidaReal);
    }

    // -------------------------
    // 5.4 Invertir arreglo
    // -------------------------

    @Test
    public void pruebaInvertirArreglo() {
        float[] entrada = {2f, 1f, 9f, 6f};
        float[] salidaEsperada = {6f, 9f, 1f, 2f};

        float[] salidaReal = opa.invertirArreglo(entrada);

        assertArrayEquals(salidaEsperada, salidaReal);
    }

    @Test
    public void pruebaInvertirArregloVacio() {
        float[] entrada = {};
        float[] salidaEsperada = {};

        float[] salidaReal = opa.invertirArreglo(entrada);

        assertArrayEquals(salidaEsperada, salidaReal);
    }

    // -------------------------
    // 5.5 Valores absolutos
    // -------------------------

    @Test
    public void pruebaValoresAbsolutosMixto() {
        float[] entrada = {2f, -3f, -4f, 5f};
        float[] salidaEsperada = {2f, 3f, 4f, 5f};

        float[] salidaReal = opa.obtenerAbsolutos(entrada);

        assertArrayEquals(salidaEsperada, salidaReal);
    }

    @Test
    public void pruebaValoresAbsolutosTodosNegativos() {
        float[] entrada = {-1f, -2f, -3f};
        float[] salidaEsperada = {1f, 2f, 3f};

        float[] salidaReal = opa.obtenerAbsolutos(entrada);

        assertArrayEquals(salidaEsperada, salidaReal);
    }

}
