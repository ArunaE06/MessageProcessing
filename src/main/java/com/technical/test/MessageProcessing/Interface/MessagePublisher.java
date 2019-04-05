/**
 * 
 */
package com.technical.test.MessageProcessing.Interface;

import java.util.Queue;

/**
 * @author aruna
 *
 */
public interface MessagePublisher {

	Queue<String> publishMessage(String inputFile);

}
