package com.ms.email.configs;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



//configuracao da fila
@Configuration
public class RabbitMQConfig {

	
	@Value("${spring.rabbitmq.queue}")
	private String queue;

    @Bean
    Queue queue() {
        return new Queue(queue, true);
    }

    @Bean
    Jackson2JsonMessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }
    
}
