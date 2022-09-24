package top.misec.webhooks.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson2.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import top.misec.webhooks.entity.WebHooksRecord;
import top.misec.webhooks.entity.WebhooksEvent;
import top.misec.webhooks.mapper.WebHooksRecordMapper;
import top.misec.webhooks.mapper.WebhooksEventMapper;
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
@RequiredArgsConstructor
public class WebHooksRecordServiceImpl extends ServiceImpl<WebHooksRecordMapper, WebHooksRecord> implements IWebHooksRecordService {

    private final WebhooksEventMapper webhooksEventMapper;


    /**
     * @param eventId            eventId
     * @param httpServletRequest httpServletRequest
     * @param requestBody        requestBody
     */
    @Override
    public void recordWebhooks(String eventId, HttpServletRequest httpServletRequest, String requestBody) {

        //如果本次webhook没有具体的event信息不处理
        if (!webhooksEventMapper.exists(new LambdaQueryWrapper<WebhooksEvent>().eq(WebhooksEvent::getEventId, eventId))) {
            return;
        }

        String header = JSON.toJSONString(ServletRequestUtils.getHeaders(httpServletRequest));

        log.info("eventId:{},header:{},body:{}", eventId, header, requestBody);

        WebHooksRecord webHooksRecord = new WebHooksRecord();

        webHooksRecord.setEventId(eventId);
        webHooksRecord.setHeader(header);
        webHooksRecord.setBody(requestBody);


        this.save(webHooksRecord);

        log.info("webhooks回调记录:{}", webHooksRecord);

        // todo push webhooks details via dingtalk，bark，email

    }
}
