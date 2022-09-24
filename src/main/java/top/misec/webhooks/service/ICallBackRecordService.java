package top.misec.webhooks.service;

import javax.servlet.http.HttpServletRequest;

import com.baomidou.mybatisplus.extension.service.IService;

import top.misec.webhooks.entity.CallBackRecord;

/**
 * <p>
 * 回调记录表 服务类
 * </p>
 *
 * @author moshi
 * @since 2022-09-23
 */
public interface ICallBackRecordService extends IService<CallBackRecord> {

    /**
     * 记录webhooks详情
     *
     * @param uuid               uuid
     * @param httpServletRequest httpServletRequest
     * @param requestBody        requestBody
     */
    void recordWebhooks(String uuid, HttpServletRequest httpServletRequest, String requestBody);
}
