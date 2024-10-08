package br.com.pug;

import br.com.pug.client.ClientHttpConfiguration;
import br.com.pug.service.PetService;

import java.io.IOException;

public class ListarPetsDoAbrigoCommand implements Command {

    @Override
    public void execute() {
        try {
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            PetService petService = new PetService(client);

            petService.listarPetsDoAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
