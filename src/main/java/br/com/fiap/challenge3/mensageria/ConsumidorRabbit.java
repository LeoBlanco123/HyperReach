package br.com.fiap.challenge3.mensageria;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumidorRabbit {
	
	@RabbitListener(queues = ConfiguracaoRabbitMQ.fila)
	public void lerMensagem(String msg) {
		System.out.println("Mensagem recebida: " + msg);
	}

}
