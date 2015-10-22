package com.easemob.weichat.konwledge.service;

import com.easemob.weichat.konwledge.KefuKonwledge;

/**
 * 客服知识库接口
 * 
 * @author wangduo
 *
 */
public interface IKefuKonwledgeService {

    void add(KefuKonwledge kefuKonwledge);
    
    void update(KefuKonwledge kefuKonwledge);
    
    void delete(String id);
}
