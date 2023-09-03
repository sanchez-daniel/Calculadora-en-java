import javax.swing.*;

//calculadora de operaciones basicas
public class Main {
    public static void main(String[] args) {
        int opcion;
        JOptionPane.showMessageDialog(null, "Bienvenido");
        do {
            JOptionPane.showMessageDialog(null, "¿Que operacion desea realizar?\n" +
                    "1) Suma\n" +
                    "2) Resta\n" +
                    "3) Multiplicacion\n" +
                    "4) Division\n" +
                    "5) Apagar calculadora");
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite la opcion"));
            if (opcion != 5) {

                float a = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del primer numero"));
                float b = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del segundo numero"));
                int resultado;
                switch (opcion) {
                    case 1:
                        resultado = (int) a + (int) b;
                        JOptionPane.showMessageDialog(null, resultado);
                        break;
                    case 2:
                        resultado = (int) a - (int) b;
                        JOptionPane.showMessageDialog(null, resultado);
                        break;
                    case 3:
                        resultado = (int) a * (int) b;
                        JOptionPane.showMessageDialog(null, resultado);
                        break;
                    case 4:
                        float result;
                        result = a * b;
                        JOptionPane.showMessageDialog(null, result);
                        break;
                }
            }

        } while (opcion != 5);


    }
}



