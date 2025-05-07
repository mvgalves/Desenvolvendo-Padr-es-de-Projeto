package one.digitalinnovation.gof.service.observer;

import one.digitalinnovation.gof.model.Cliente;

public interface ClienteObserver {
    void notificar(Cliente cliente);
}