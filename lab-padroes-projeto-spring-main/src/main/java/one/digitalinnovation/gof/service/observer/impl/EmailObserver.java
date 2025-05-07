package one.digitalinnovation.gof.service.observer.impl;

import org.springframework.stereotype.Component;
import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.observer.ClienteObserver;

@Component
public class EmailObserver implements ClienteObserver {

    @Override
    public void notificar(Cliente cliente) {
        System.out.println("[EMAIL] Bem-vindo, " + cliente.getNome() + "! Seu cadastro foi realizado com sucesso.");
    }
}
