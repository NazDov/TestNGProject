package com.softserveinc.edu.ita.testngpractice.test.concurrency;

import org.testng.annotations.Test;

public class ConcurrencyTest {
	
  @Test(threadPoolSize = 3, invocationCount = 20)
  public void testConcurrentMethodRunning() {
	  System.out.print(Thread.currentThread().getId()+" ");
  }
}
