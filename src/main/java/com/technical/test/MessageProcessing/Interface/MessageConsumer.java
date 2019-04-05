/**
 * 
 */
package com.technical.test.MessageProcessing.Interface;

import java.util.Queue;

/**
 * @author aruna
 *
 */
public interface MessageConsumer {

	void consumeMessage(Queue<String> messageQ);

}
