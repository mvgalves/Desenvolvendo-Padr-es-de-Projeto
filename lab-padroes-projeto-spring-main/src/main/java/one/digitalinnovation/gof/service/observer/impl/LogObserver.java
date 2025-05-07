package one.digitalinnovation.gof.service.observer.impl;

import org.springframework.stereotype.Component;
import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.observer.ClienteObserver;

@Component
public class LogObserver implements ClienteObserver {

    @Override
    public void notificar(Cliente cliente) {
        System.out.println("[LOG] Novo cliente adicionado: " + cliente.getNome());
    }
}