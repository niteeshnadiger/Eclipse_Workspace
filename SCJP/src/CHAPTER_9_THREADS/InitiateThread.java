package CHAPTER_9_THREADS;

public class InitiateThread implements Runnable {
	
	

	public static void main(String[] args) {
		
		
		new InitiateThread().run();
	}

	@Override
	public void run() {
		System.out.println("Thread");
		System.out.println("Main");
		System.out.println("Hello World");
		
	}
}
