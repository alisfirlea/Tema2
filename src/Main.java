public class Main {

    public static void main(String[] args) {
        double suma=0,n=4;
        double average;

        for(int i=1;i<=n;i++) {
            suma += i;
        }

        average = suma/n;
        System.out.println("Mediat aritmetica a numerelor de la 1 la  " +n+ " este egala cu "+average );

    }
}
