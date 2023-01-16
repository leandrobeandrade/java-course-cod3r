package streams.init;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
//		Consumer<Integer> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "Js\n");
		langs.forEach(print);
		
		String[] mais_langs = {"Python ", "Lisp ", "Perl ", "Go\n"};
		Stream.of(mais_langs).forEach(print);
		Arrays.stream(mais_langs).forEach(print);
		Arrays.stream(mais_langs, 1, 4).forEach(print);
		
		List<String> outras_langs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outras_langs.stream().forEach(print);
		outras_langs.parallelStream().forEach(print);
		
//		Stream.generate(() -> "a").forEach(print);
//		Stream.iterate(0, n -> n + 1).forEach(println);
	}

}
