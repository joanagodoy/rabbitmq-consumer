package microsservico.consumidorestoquepreco.consumidorestoqueprecorabbitmq.consumer;

import constants.RabbitMQConstants;
import dto.EstoqueDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class EstoqueConsumer {

    @RabbitListener(queues = RabbitMQConstants.FILA_ESTOQUE)
    private void consumidor(EstoqueDTO estoqueDTO){
        System.out.println(estoqueDTO.codigoProduto);
        System.out.println(estoqueDTO.quantidadeProduto);
        System.out.println("--------------------------------------------");
    }
}
