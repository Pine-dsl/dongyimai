package com.dsl.xxx.listener;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dsl.xxx.service.ItemSearchService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import java.util.Arrays;

public class ItemDeleteListener implements MessageListener {
    @Reference
    private ItemSearchService itemSearchService;

    @Override
    public void onMessage(Message message) {
        try {
            ObjectMessage objectMessage= (ObjectMessage)message;
            Long[]  goodsIds = (Long[]) objectMessage.getObject();
            System.out.println("ItemDeleteListener监听接收到消息..."+goodsIds);
            itemSearchService.deleteByGoodsIds(Arrays.asList(goodsIds));
            System.out.println("成功删除索引库中的记录");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
