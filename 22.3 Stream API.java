import java.util.Arrays;
import java.util.List;

class Demo {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        // Stream<Integer> s1=nums.stream();
        // Stream<Integer> s2= s1.filter(n ->n%2==0);
        // Stream<Integer> s3= s2.map(n->n*2);
        // int result=s3.reduce(0,(c,e)->c+e);
        //
        // s2.forEach(n -> System.out.println(n));
        // s3.forEach(n -> System.out.println(n));
        //
        // s1.forEach(n-> System.out.println(n));
        // s1.forEach(n-> System.out.println(n));

        int result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);
        System.out.println(result);

    }
}

// 2. Opérations Intermédiaires :
// Les opérations intermédiaires modifient le stream sans le consommer. Elles
// sont paresseuses et sont évaluées uniquement lors d'une opération terminale.

// filter(Predicate<T>) : Filtrer les éléments.
// map(Function<T, R>) : Transformer les éléments.
// sorted() : Trier les éléments.
// distinct() : Supprimer les doublons.
// limit(long) : Limiter le nombre d'éléments.
// 3. Opérations Terminales :
// Les opérations terminales produisent un résultat ou un effet secondaire, et
// elles consomment le stream.

// collect(Collector<T, A, R>) : Collecter les éléments dans une collection.
// forEach(Consumer<T>) : Appliquer une action à chaque élément.
// reduce(T identity, BinaryOperator<T>) : Combiner les éléments en un seul
// résultat (ex : somme, produit).
// count() : Compter le nombre d'éléments.
// anyMatch(Predicate<T>) : Vérifier si un élément satisfait un critère.
// allMatch(Predicate<T>) : Vérifier si tous les éléments satisfont un critère.