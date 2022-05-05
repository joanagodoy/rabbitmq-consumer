package microsservico.consumidorestoquepreco.consumidorestoqueprecorabbitmq.consumer;

import constants.RabbitMQConstants;
import dto.PrecoDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PrecoConsumer {

    @RabbitListener(queues = RabbitMQConstants.FILA_ESTOQUE)
    private void consumidor(PrecoDTO precoDTO){
        System.out.println(precoDTO.codigoProduto);
        System.out.println(precoDTO.preco);
        System.out.println("--------------------------------------------");
    }
}
