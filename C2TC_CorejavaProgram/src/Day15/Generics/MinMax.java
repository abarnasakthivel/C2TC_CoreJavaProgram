package Day15.Generics;

//Generic Interface
public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();
}
