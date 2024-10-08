package br.com.pug;

import br.com.pug.client.ClientHttpConfiguration;
import br.com.pug.service.AbrigoService;

import java.io.IOException;

public class CadastrarAbrigoCommand implements Command {
    @Override
    public void execute() {
        try {
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            AbrigoService abrigoService = new AbrigoService(client);

            abrigoService.cadastrarAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
