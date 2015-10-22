package com.easemob.weichat.konwledge;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(indexName = "kefukonwledge", type = "kefukonwledge")
public class KefuKonwledge {

    // FIXME id自动生成？
    @Id
    private String id;
    
    @Field(type = FieldType.Integer, index = FieldIndex.not_analyzed, store = true)
    private Integer tenantId;
    
    @Field(type = FieldType.String, index = FieldIndex.analyzed, store = true)
    private String question;
    
    @Field(type = FieldType.String, index = FieldIndex.analyzed, store = true)
    private String answer;
    
    
    
}
