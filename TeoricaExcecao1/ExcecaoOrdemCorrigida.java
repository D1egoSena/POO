package TeoricaExcecao1; // Questão 9

public class ExcecaoOrdemCorrigida {
    public static void main(String[] args) {
        try {
            int[] numeros = new int[5];
            numeros[7] = 10; // Isso causará uma exceção ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Capturada exceção de subclasse: " + e);
        } catch (Exception e) {
            System.out.println("Capturada exceção de superclasse: " + e);
        }
    }
}