// Implementación concreta de la operación División
class Division extends Operacion {
    @Override
    public double calcular(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        
        int signo = 1;
        
        if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
            signo = -1; // Si uno de los operandos es negativo, el resultado es negativo.
        }
        
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        
        double resultado = 0;
        
        while (num1 >= num2) {
            num1 = new Resta().calcular(num1, num2);
            resultado = new Suma().calcular(resultado, 1); // Contador de la división
        }
        
        return resultado * signo;
    }
}
