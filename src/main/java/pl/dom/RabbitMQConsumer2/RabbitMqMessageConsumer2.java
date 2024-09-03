package pl.dom.RabbitMQConsumer2;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqMessageConsumer2 {

	@RabbitListener(queues = {"${dom.queue}"})
	public void consumeMessage(String message) {
		System.out.println("Message recived2: " + message);
	}
	
	@RabbitListener(queues = {"${dom.queue.fanout2}"})
	public void consumeMessageFanoutQueue2(String message) {
		System.out.println("Message recived: " + message);
	}
}
