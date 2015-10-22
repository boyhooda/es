package com.easemob.weichat.konwledge;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = {"com.easemob.weichat.konwledge.persistence.es"})
public class Config {

    @SuppressWarnings("resource")
    @Bean
    public ElasticsearchTemplate elasticsearchTemplate() {
        Client client = new TransportClient().addTransportAddress(new InetSocketTransportAddress("localhost", 9300));
        return new ElasticsearchTemplate(client);
    }
}
