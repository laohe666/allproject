package com.laohe;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost req = new HttpPost("http://ps.ivfonly.com:9090/yu/api/zsly/no_saveInfSynchronously");
        StringEntity stringEntity = new StringEntity("[{\n" +
                "    \"checkerName\": \"string\",\n" +
                "    \"developmentDays\": 3,\n" +
                "    \"embryoPosition\": \"AA-1-1-A5\",\n" +
                "    \"embryoQuantity\": 1,\n" +
                "    \"embryoScore\": \"1\",\n" +
                "    \"fId\": \"string\",\n" +
                "    \"freezerName\": \"string\",\n" +
                "    \"freezingType\": 0,\n" +
                "    \"frozenNumber\": \"string\",\n" +
                "    \"inseminationProgram\": \"string\",\n" +
                "    \"manAge\": 27,\n" +
                "    \"manName\": \"string1\",\n" +
                "    \"medicalRecordId\": \"string\",\n" +
                "    \"remarks\": \"string\",\n" +
                "    \"status\": 0,\n" +
                "    \"womanAge\": 25,\n" +
                "    \"womanName\": \"string2\"\n" +
                "}\n]", ContentType.APPLICATION_JSON);
        req.setEntity(stringEntity);
        CloseableHttpResponse rsp = httpClient.execute(req);
        String s = EntityUtils.toString(rsp.getEntity());
        System.out.println(s);
    }
}
