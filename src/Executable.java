public class Executable extends Thread {

	private int id;

	public Executable(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("Starting: " + id);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Finishing: " + id);
	}
}
