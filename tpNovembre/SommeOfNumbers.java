public class SommeOfNumbers {
    public void somme(int n){
        int compteur = 0;
        for(int i = 1; i<=n; i++){

            compteur=compteur+i;
        }

        System.out.println("La somme de 1 jusqu'au "+ n + " est "+ compteur);
    }

    public static void main(String[] args) {
        SommeOfNumbers test = new SommeOfNumbers();
        test.somme(5);
    }
}
