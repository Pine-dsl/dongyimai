package com.dsl.xxx.service;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SmsUtil {
    @Value("${AccessKeyID}")
    private String AccessKeyID;

    @Value("${AccessKeySecret}")
    private String AccessKeySecret;

    private String domain="dysmsapi.aliyuncs.com";


    //发送短信

    public CommonResponse sendSms(String mobile, String code) throws ClientException, ClientException {

        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", AccessKeyID, AccessKeySecret);
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        //request.setProtocol(ProtocolType.HTTPS);
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", mobile);
        request.putQueryParameter("SignName", "优就业");
        request.putQueryParameter("TemplateCode", "SMS_202805132");
        request.putQueryParameter("TemplateParam", "{\"code\":\""+code+ "\"}");
        CommonResponse response = client.getCommonResponse(request);
        System.out.println(response.getData());
        return response;

    }


}
