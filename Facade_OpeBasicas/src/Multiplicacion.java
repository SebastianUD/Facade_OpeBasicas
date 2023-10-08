// Implementación concreta de la operación Multiplicación
class Multiplicacion extends Operacion {
    @Override
    public double calcular(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            return 0; // Si uno de los operandos es cero, el resultado es cero.
        }
        
        int signo = 1;
        
        if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
            signo = -1; // Si uno de los operandos es negativo, el resultado es negativo.
        }
        
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        
        double resultado = 0;
        for (int i = 0; i < num2; i++) {
            resultado = new Suma().calcular(resultado, num1);
        }
        
        return resultado * signo;
    }
}
