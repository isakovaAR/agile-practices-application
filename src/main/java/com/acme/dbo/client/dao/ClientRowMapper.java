package com.acme.dbo.client.dao;

import com.acme.dbo.client.domain.Client;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientRowMapper implements RowMapper<Client> {

    @Override
    public Client mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Client(
                resultSet.getLong("ID"),
                resultSet.getString("LOGIN"),
                resultSet.getString("SECRET"),
                resultSet.getString("SALT"),
                resultSet.getTimestamp("CREATED").toInstant(),
                resultSet.getBoolean("ENABLED")
        );
    }
}