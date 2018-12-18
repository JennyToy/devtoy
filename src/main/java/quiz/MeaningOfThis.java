/*
 */
package quiz;

import lombok.extern.slf4j.Slf4j;

/**
 *
 *
 * @author
 * @since
 */
@Slf4j
public class MeaningOfThis {
	public final int value = 4;
	public void doIt() {
		int value = 6;
		Runnable r = new Runnable() {
			public final int value = 5;
			@Override
			public void run() {
				int value = 10;
				log.debug("this.value: {}", this.value);
			}
		};
		r.run();
	}

	public static void main(String... args) {
		MeaningOfThis m = new MeaningOfThis();
		m.doIt();
		m.doItLambdas();
	}

	public void doItLambdas() {
		//int value = 6;
		Runnable r = () -> {
			final int value = 5;
			log.debug("this.value: {}", this.value);
			log.debug("second sentence");
		};
		r.run();
	}
}