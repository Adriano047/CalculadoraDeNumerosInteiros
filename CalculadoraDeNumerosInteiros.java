package DesafioAgosto;

import java.util.Locale;
import javax.swing.JOptionPane;

public class CalculadoraDeNumerosInteiros {
    public static void main(String[] args) {
        // Variavel condicional do while;
        Integer Escolha = 0;
        Float Total = null;
        do { 
            var msn = "";
            // Para Garantir que caso ocorra alguma tentativa de divisão por zero ou resto da divisão por zero ele volte para o começo do loop ignorando o ultimo OptionDialog
            var Erro = false;
            String Operações[] = {"+", "-", "*", "/", "%"};
            // Caso seja o primeiro calculo;
            if (Total == null) {
                JOptionPane.showMessageDialog(null, "Calculadora de Numeros Inteiros");
                var valor1 = "";
                var notInt = false;
                var NãoDigitou = " ";
                do {
                    notInt = false;
                    valor1 = JOptionPane.showInputDialog("Digite um numero: ");
                    // Impedindo o usuario de sair ao apertar o X e o cancelar
                    while (valor1 == null) {
                        JOptionPane.showMessageDialog(null, "Por favor Digite um numero Inteiro", "Usuario não Digitou nada", JOptionPane.ERROR_MESSAGE);
                        valor1 = JOptionPane.showInputDialog("Digite um numero: ");
                    }
                    NãoDigitou = valor1.replaceAll(" ", "");
                    // Verificando se o usuario digitou algo
                    if (NãoDigitou.equals("")) {
                        JOptionPane.showMessageDialog(null, "Por favor Digite um numero Inteiro", "Usuario não Digitou nada", JOptionPane.ERROR_MESSAGE);
                    } 
                    // Tirando os espaços
                    valor1 = valor1.trim();
                    // Impedindo que numeros não inteiros sejam aceitos
                    for (var c = 0; c < valor1.length(); c++) {
                        if (valor1.charAt(c) >= '0' && valor1.charAt(c) <= '9' || valor1.charAt(0) == '-') {}
                        else {
                            JOptionPane.showMessageDialog(null, "Utilize apenas numeros Inteiros", "Tentativa de Inserir numeros não inteiros", JOptionPane.ERROR_MESSAGE);
                            notInt = true;
                            break; 
                        }
               
                }}while(NãoDigitou.equals("") || notInt == true);
            
                Integer sinal = JOptionPane.showOptionDialog(null, "Escolha qual operação deseja realizar: ", null, 0, 3, null, Operações, Operações[0]);
                // Impedindo que o usario saia
                while (sinal < 0 || sinal > 4) {
                    JOptionPane.showMessageDialog(null, "Por favor! Informe o sinal", "Não Informou o Sinal", JOptionPane.WARNING_MESSAGE);
                    sinal = JOptionPane.showOptionDialog(null, "Escolha qual operação deseja realizar: ", null, 0, 3, null, Operações, Operações[0]);
                }
                var valor2 = "";
                do {
                    notInt = false;
                    valor2 = JOptionPane.showInputDialog("Digite outro numero: ");
                    while (valor2 == null) {
                        JOptionPane.showMessageDialog(null, "Por favor Digite um numero Inteiro", "Usuario não Digitou nada", JOptionPane.ERROR_MESSAGE);
                        valor2 = JOptionPane.showInputDialog("Digite outro numero: ");
                    }
                    NãoDigitou = valor2.replaceAll(" ", "");
                    if (NãoDigitou.equals("")) {
                        JOptionPane.showMessageDialog(null, "Por favor Digite um numero Inteiro", "Usuario não Digitou nada", JOptionPane.ERROR_MESSAGE);
                    }
                    valor2 = valor2.trim();
                    for (var c = 0; c < valor2.length(); c++) {
                        if (valor2.charAt(c) >= '0' && valor2.charAt(c) <= '9' || valor2.charAt(0) == '-') {}
                        else {
                            JOptionPane.showMessageDialog(null, "Utilize apenas numeros Inteiros", "Tentativa de Inserir numeros não inteiros", JOptionPane.ERROR_MESSAGE);
                            notInt = true;
                            break; 
                        }
                }}while(NãoDigitou.equals("") || notInt == true);

                Integer Num1 = Integer.parseInt(valor1);
                Integer Num2 = Integer.parseInt(valor2);
                // Reiniciando o calculo caso tenha a tentativa de divisão por zero ou resto da divisão por zero
                if (Num1 == 0 || Num2 == 0 && sinal.equals(3) || sinal.equals(4)) {
                    msn = "Erro!! Infelizmente não podemos realizar essa operação";
                    Erro = true;
                }
                else if (sinal.equals(0))
                    Total = Num1 + (float) Num2; 
                else if (sinal.equals(1))
                    Total = Num1 - (float) Num2;
                else if (sinal.equals(2))
                    Total = Num1 * (float) Num2;
                else if (sinal.equals(3))
                    Total = Num1 / (float) Num2;
                else if (sinal.equals(4)) 
                    Total = Num1 % (float) Num2;
                if (Erro == false) {
                    msn = String.format(Locale.US,"Calculo: %d %s %d = %.2f\n TOTAL: %.2f", Num1, Operações[sinal], Num2, Total, Total); 
                }
                // Fazendo o calculo usando o Total;
            }else {
                JOptionPane.showMessageDialog(null, "Total: " + Total);
                Integer sinal = JOptionPane.showOptionDialog(null, "Escolha qual operação deseja realizar: ", "Operadores", 0, 3, null, Operações, Operações[0]);
                while (sinal < 0 || sinal > 4) {
                    JOptionPane.showMessageDialog(null, "Por favor! Informe o sinal", "Não Informou o Sinal", JOptionPane.WARNING_MESSAGE);
                    sinal = JOptionPane.showOptionDialog(null, "Escolha qual operação deseja realizar: ", null, 0, 3, null, Operações, Operações[0]);
                }
                var valor2 = "";
                var notInt = false;
                var NãoDigitou = " ";
                do {
                    notInt = false;
                    valor2 = JOptionPane.showInputDialog("Digite outro numero: ");
                    while (valor2 == null) {
                        JOptionPane.showMessageDialog(null, "Por favor Digite um numero Inteiro", "Usuario não Digitou nada", JOptionPane.ERROR_MESSAGE);
                        valor2 = JOptionPane.showInputDialog("Digite outro numero: ");
                    }
                    NãoDigitou = valor2.replaceAll(" ", "");
                    if (NãoDigitou.equals("")) {
                        JOptionPane.showMessageDialog(null, "Por favor Digite um numero Inteiro", "Usuario não Digitou nada", JOptionPane.ERROR_MESSAGE);
                    }
                    valor2 = valor2.trim();
                    for (var c = 0; c < valor2.length(); c++) {
                        if (valor2.charAt(c) >= '0' && valor2.charAt(c) <= '9' || valor2.charAt(0) == '-') {}
                        else {
                            JOptionPane.showMessageDialog(null, "Utilize apenas numeros Inteiros", "Tentativa de Inserir numeros não inteiros", JOptionPane.ERROR_MESSAGE);
                            notInt = true;
                            break; 
                        }
                }}while(NãoDigitou.equals("") || notInt == true);
                Integer Num2 = Integer.parseInt(valor2);
                var NewTotal = Total;
                if (Num2 == 0 && sinal.equals(3) || sinal.equals(4)) {
                    msn = "Erro!! Infelizmente não podemos realizar essa operação";
                    Erro = true;
                }
                else if (sinal.equals(0))
                    Total += Num2;
                else if (sinal.equals(1))
                    Total -= Num2;
                else if (sinal.equals(2))
                    Total *= Num2;
                else if (sinal.equals(3)) 
                    Total /= Num2;
                else if (sinal.equals(4))
                    Total %= Num2;
                if (Erro == false) {
                    msn = String.format(Locale.US,"Calculo: %.2f %s %d = %.2f\n TOTAL: %.2f", NewTotal, Operações[sinal], Num2, Total, Total);
                }
            }
            JOptionPane.showMessageDialog(null, msn);
            if (Erro == false) {
                String Op[] = {"Nova", "Continuar", "Sair"};
                Escolha = JOptionPane.showOptionDialog(null, "Realizar Novo Calculo?\nContinuar este Calculo?\nSair?", null, 0, 3, null, Op, Op[0]);
            }
            // Reiniciando o valor de total caso o usuario queira começar uma nova operação
            if (Escolha.equals(0)) {
                Total = null;
            }
        }while(Escolha.equals(0) || Escolha.equals(1));
    }
}
