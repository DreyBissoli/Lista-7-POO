package br.com.ecommerce.main;

import br.com.ecommerce.exception.TipoFreteInvalidoException;
import br.com.ecommerce.model.CalculadoraFrete;
import br.com.ecommerce.model.FreteMotoboy;
import br.com.ecommerce.model.FretePac;
import br.com.ecommerce.model.FreteSedex;

public class MainTeste {

    public static void main(String[] args) {

        CalculadoraFrete calculadora = new CalculadoraFrete();

        try {
            double freteSedex = calculadora.processarFrete(100.00, new FreteSedex());
            double fretePac = calculadora.processarFrete(100.00, new FretePac());
            double freteMotoboy = calculadora.processarFrete(100.00, new FreteMotoboy());

            System.out.printf("Frete Sedex: R$ %.2f%n", freteSedex);
            System.out.printf("Frete PAC: R$ %.2f%n", fretePac);
            System.out.printf("Frete Motoboy: R$ %.2f%n", freteMotoboy);

            calculadora.processarFrete(100.00, null);

        } catch (TipoFreteInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
