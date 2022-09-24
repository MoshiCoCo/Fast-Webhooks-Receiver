package top.misec.webhooks.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson2.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import lombok.extern.slf4j.Slf4j;
import top.misec.webhooks.entity.WebHooksRecord;
import top.misec.webhooks.mapper.WebHooksRecordMapper;
import top.misec.webhooks.service.IWebHooksRecordService;
import top.misec.webhooks.utils.ServletRequestUtils;

/**
 * <p>
 * 回调记录表 服务实现类
 * </p>
 *
 * @author moshi
 * @since 2022-09-23
 */
@Service
@Slf4j
public class WebHooksRecordServiceImpl extends ServiceImpl<WebHooksRecordMapper, WebHooksRecord> implements IWebHooksRecordService {

    /**
     * @param eventId            eventId
     * @param httpServletRequest httpServletRequest
     * @param requestBody        requestBody
     */
    @Override
    public void recordWebhooks(String eventId, HttpServletRequest httpServletRequest, String requestBody) {

        String header = JSON.toJSONString(ServletRequestUtils.getHeaders(httpServletRequest));

        log.info("uuid:{},header:{},body:{}", eventId, header, requestBody);

        WebHooksRecord webHookRecord = new WebHooksRecord();

        webHookRecord.setEventId(eventId);
        webHookRecord.setHeader(header);
        webHookRecord.setBody(requestBody);

        log.info("webhooks回调记录:{}", webHookRecord);

        log.info(httpServletRequest.getQueryString());
        log.info(JSON.toJSONString(httpServletRequest.getParameterMap()));

        this.save(webHookRecord);

    }
}
