package org.example;

import java.util.stream.IntStream;

public class Test {
	public static void main(String[] args) {
		final Liczydlo o1 = new Liczydlo();
		o1.obliczenia1();
		o1.obliczenia2();

	 	final Liczydlo o2 = Liczydlo.getInstance();
		o2.obliczenia1();
		o2.obliczenia2();

		final LiczydloSingleton o3 = LiczydloSingleton.getInstance();
		o3.obliczenia1();
		o3.obliczenia2();

		final ObjectPool<Liczydlo> liczydloPool = new LiczydloPool();

		IntStream.rangeClosed(1, 150).forEach(i -> {
			System.out.println("Attempt: " + i);
			Liczydlo l1 = null;
			try {
				l1 = liczydloPool.checkOut();
			} catch (MaxPoolSizeException e) {
				System.out.println(e.getMessage());
			}
			if (l1 != null) {
				l1.obliczenia1();
				l1.obliczenia2();
				liczydloPool.checkIn(l1);
			} else {
				System.out.println("No free objects!");
			}
			System.out.println(liczydloPool);
		});
		
	}
}
