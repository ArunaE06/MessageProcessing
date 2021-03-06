package com.technical.test.MessageProcessing.impl;

import java.io.IOException;
import java.util.Queue;
import org.junit.*;
import static org.junit.Assert.*;

import com.technical.test.MessageProcessing.Interface.MessagePublisher;



/**
 * @author aruna
 * The class <code>PublisherImplTest</code> contains tests for the class <code>{@link PublisherImpl}</code>.
 *
 */
public class PublisherImplTest {
	
	@Test
	public void testPublisherSuccessScenerio()
		throws Exception {

		MessagePublisher result = new PublisherImpl();
		Queue<String> messageQ = result.publishMessage("src/test/resources/testData1.txt");
		assertEquals(10, messageQ.size());
	}

	@Ignore
	@Test (expected=IOException.class)
	public void testPublisherExceptionScenerio()
		throws Exception {
		MessagePublisher result = new PublisherImpl();
		Queue<String> messageQ = result.publishMessage("src/test/resources/testData.txt");
	}
}