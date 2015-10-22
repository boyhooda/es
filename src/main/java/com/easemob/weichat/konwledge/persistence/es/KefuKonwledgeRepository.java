package com.easemob.weichat.konwledge.persistence.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.easemob.weichat.konwledge.KefuKonwledge;

public interface KefuKonwledgeRepository extends ElasticsearchRepository<KefuKonwledge, String> {
    
}
