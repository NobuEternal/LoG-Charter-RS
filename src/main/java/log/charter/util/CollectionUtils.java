package log.charter.util;

import static java.util.stream.Collectors.toCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionUtils {
	public static class Pair<A, B> {
		public A a;
		public B b;

		public Pair(final A a, final B b) {
			this.a = a;
			this.b = b;
		}
	}

	public static class ArrayList2<T> extends ArrayList<T> {
		private static final long serialVersionUID = 1L;

		public ArrayList2() {
			super();
		}

		public ArrayList2(final int initialCapacity) {
			super(initialCapacity);
		}

		public ArrayList2(final List<T> list) {
			super(list);
		}

		@SafeVarargs
		public ArrayList2(final T... elements) {
			super();
			for (final T element : elements) {
				add(element);
			}
		}

		public T getLast() {
			return isEmpty() ? null : get(size() - 1);
		}

		public <U> ArrayList2<U> map(final Function<T, U> mapper) {
			return stream()//
					.map(mapper)//
					.collect(toCollection(ArrayList2::new));
		}

		public <U> ArrayList2<U> mapWithId(final BiFunction<Integer, T, U> mapper) {
			final ArrayList2<U> list = new ArrayList2<>(size());
			for (int i = 0; i < size(); i++) {
				list.add(mapper.apply(i, get(i)));
			}
			return list;
		}

		public <U, V> HashMap2<U, V> toMap(final Function<T, Pair<U, V>> mapper) {
			return stream()//
					.map(mapper)//
					.collect(Collectors.toMap(pair -> pair.a, pair -> pair.b, (a, b) -> a, HashMap2::new));
		}

		public boolean contains(final Predicate<T> predicate) {
			for (final T element : this) {
				if (predicate.test(element)) {
					return true;
				}
			}

			return false;
		}
	}

	public static class HashSet2<T> extends HashSet<T> {
		private static final long serialVersionUID = 1L;

		public HashSet2() {
			super();
		}

		public HashSet2(final int initialCapacity) {
			super(initialCapacity);
		}

		public HashSet2(final Collection<T> collection) {
			super(collection);
		}

		public <U> HashSet2<U> map(final Function<T, U> mapper) {
			return stream()//
					.map(mapper)//
					.collect(toCollection(HashSet2::new));
		}

		public <U, V> HashMap2<U, V> toMap(final Function<T, Pair<U, V>> mapper) {
			return stream()//
					.map(mapper)//
					.collect(Collectors.toMap(pair -> pair.a, pair -> pair.b, (a, b) -> a, HashMap2::new));
		}

		public boolean contains(final Predicate<T> predicate) {
			for (final T element : this) {
				if (predicate.test(element)) {
					return true;
				}
			}

			return false;
		}
	}

	public static class HashMap2<T, U> extends HashMap<T, U> {
		private static final long serialVersionUID = 1L;

		public HashMap2() {
			super();
		}

		public HashMap2(final Map<T, U> other) {
			super(other);
		}

		public <V> ArrayList2<V> map(final BiFunction<T, U, V> mapper) {
			return entrySet().stream()//
					.map(entry -> mapper.apply(entry.getKey(), entry.getValue()))//
					.collect(toCollection(ArrayList2::new));
		}

		public <V, W> HashMap2<V, W> map(final Function<T, V> keyMapper, final Function<U, W> valueMapper) {
			final HashMap2<V, W> newMap = new HashMap2<>();
			entrySet().stream()//
					.forEach(entry -> newMap.put(keyMapper.apply(entry.getKey()), valueMapper.apply(entry.getValue())));
			return newMap;
		}
	}

	public static int[] arrayOf(final int... values) {
		return values;
	}
}
