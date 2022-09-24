package top.misec.webhooks.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson2.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import lombok.extern.slf4j.Slf4j;
import top.misec.webhooks.entity.CallBackRecord;
import top.misec.webhooks.mapper.CallBackRecordMapper;
import top.misec.webhooks.service.ICallBackRecordService;
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
public class CallBackRecordServiceImpl extends ServiceImpl<CallBackRecordMapper, CallBackRecord> implements ICallBackRecordService {

    /**
     * @param uuid               uuid
     * @param httpServletRequest httpServletRequest
     * @param requestBody        requestBody
     */
    @Override
    public void recordWebhooks(String uuid, HttpServletRequest httpServletRequest, String requestBody) {

        String header = JSON.toJSONString(ServletRequestUtils.getHeaders(httpServletRequest));

        CallBackRecord callBackRecord = new CallBackRecord();

        callBackRecord.setCallBackUuid(uuid);
        callBackRecord.setCallBackHeader(header);
        callBackRecord.setCallBackBody(requestBody);

        log.info(httpServletRequest.getQueryString());
        log.info(JSON.toJSONString(httpServletRequest.getParameterMap()));
        log.info(com.alibaba.fastjson.JSON.toJSONString(httpServletRequest.getParameterMap()));


        this.save(callBackRecord);

    }
}
