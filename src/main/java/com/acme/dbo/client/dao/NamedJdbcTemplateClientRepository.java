package com.acme.dbo.client.dao;

import com.acme.dbo.client.domain.Client;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

import static lombok.AccessLevel.PRIVATE;

@Repository
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE)
@Slf4j
@SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
public class NamedJdbcTemplateClientRepository implements ClientRepository {
    @Autowired
    final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Autowired
    final BeanPropertyRowMapper<Client> clientBeanPropertyRowMapper;

    @Override
    public Optional<Client> findByLogin(String login) {
        throw new RuntimeException("Method is not implemented yet!");
    }

    @Override
    public Client saveAndFlush(Client clientDto) {
        throw new RuntimeException("Method is not implemented yet!");
    }

    @Override
    public Collection<Client> findAll() {
        return namedParameterJdbcTemplate.query(
                "SELECT * FROM CLIENT",
                clientBeanPropertyRowMapper
        );
    }

    @Override
    public Optional<Client> findById(long id) {
        throw new RuntimeException("Method is not implemented yet!");
    }

    @Override
    public void deleteById(long clientId) {
        throw new RuntimeException("Method is not implemented yet!");
    }

    @Override
    public void deleteAll() {
        throw new RuntimeException("Method is not implemented yet!");
    }
}