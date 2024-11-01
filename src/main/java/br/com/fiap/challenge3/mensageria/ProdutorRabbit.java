package br.com.fiap.challenge3.mensageria;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutorRabbit {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public void enviarMensagem(String msg) {
		rabbitTemplate.convertAndSend(ConfiguracaoRabbitMQ.roteador, 
				ConfiguracaoRabbitMQ.chave_rota, 
				msg);
		System.out.println("Mensagem enviada: " + msg);
		
	}

}
