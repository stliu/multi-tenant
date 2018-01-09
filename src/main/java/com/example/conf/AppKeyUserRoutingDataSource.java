package com.example.conf;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author stliu @ apache.org
 */
public class AppKeyUserRoutingDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return null;
    }
}
