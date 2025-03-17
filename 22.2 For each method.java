import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Demo {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        // Consumer<Integer> con=new Consumer<Integer>() {
        //
        // public void accept(Integer n)
        // {
        // System.out.println(n);
        // }
        // };

        Consumer<Integer> con = n -> System.out.println(n);

        nums.forEach(n -> System.out.println(n));

        // nums.forEach(null);
        // nums.forEach(con);

        // nums.forEach(n -> System.out.println(n));

    }
}

// En Java, Consumer est une interface fonctionnelle de la bibliothèque
// java.util.function. Elle représente une opération qui prend un seul argument
// et qui ne retourne pas de résultat. C'est souvent utilisé dans des opérations
// qui doivent effectuer des actions sans renvoyer de valeur.