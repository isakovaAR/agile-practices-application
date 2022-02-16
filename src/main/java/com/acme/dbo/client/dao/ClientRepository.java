package com.acme.dbo.client.dao;

import com.acme.dbo.client.domain.Client;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import java.util.Collection;
import java.util.Optional;

@ConditionalOnProperty(name = "features.client", havingValue = "true", matchIfMissing = true)
public interface ClientRepository {
    Optional<Client> findByLogin(String login);

    Client saveAndFlush(Client clientDto);

    Collection<Client> findAll();

    Optional<Client> findById(long id);

    void deleteById(long clientId);

    void deleteAll();
}