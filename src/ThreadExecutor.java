import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutor {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 50; i++) {
			executor.execute(new Executable(i));
		}
	}
}
