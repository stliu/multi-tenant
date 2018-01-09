package com.example.conf;

import com.example.repository.DataSourceEntityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author stliu @ apache.org
 */
@Component
public class DataSourceManager {

    @Autowired
    private DataSource primaryDatasource;

    @Autowired
    private DataSourceEntityRepository dataSourceEntityRepository;

    @Value("${db.count:1}")
    private int dbCount;
    @Value("${db.table.users.count:20000}")
    private int usersPerTableCount;

    public DataSource getPrimaryDatasource() {
        return primaryDatasource;
    }


//    private DataSource initialize(DataSource dataSource) {
//        ClassPathResource schemaResource = new ClassPathResource("schema.sql");
//        ClassPathResource dataResource = new ClassPathResource("data.sql");
//        ResourceDatabasePopulator populator = new ResourceDatabasePopulator(schemaResource, dataResource);
//        populator.execute(dataSource);
//        return dataSource;
//    }


    public UserLocationIndex findUserLocation(long appId, long userId) {
        //should be fast, very fast;
        return new UserLocationIndex("db-" + (appId % dbCount), userId % usersPerTableCount);

    }


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserLocationIndex {
        private String datasourceName;
        private long tableIndex;
    }
}
