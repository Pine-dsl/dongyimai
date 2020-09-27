package com.dsl.xxx.service.listener;

import com.aliyuncs.CommonResponse;
import com.aliyuncs.exceptions.ClientException;
import com.dsl.xxx.service.SmsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

@Component("smsListener")
public class SmsListener implements MessageListener {

    @Autowired
    private SmsUtil smsUtil;

    @Override
    public void onMessage(Message message) {
        if(message instanceof MapMessage){
            MapMessage map=(MapMessage)message;
            try {
                //1、接收手机号码
                String mobile = map.getString("mobile");
//                //2、签名
//                String signname = map.getString("signname");
                //3、模板编号
                String code = map.getString("code");
//                //4、模板参数 json串
//                String templateparam = map.getString("templateparam");
//发送短信
                CommonResponse commonResponse = smsUtil.sendSms(mobile,code);
                System.out.println(commonResponse.getData());
            } catch (ClientException e) {
                e.printStackTrace();
            } catch (JMSException e){
                e.printStackTrace();
            }
        }

    }
}
