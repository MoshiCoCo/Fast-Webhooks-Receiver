package top.misec.webhooks.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import top.misec.webhooks.service.ICallBackRecordService;

/**
 * <p>
 * 回调记录表 前端控制器
 * </p>
 *
 * @author moshi
 * @since 2022-09-23
 */
@RequestMapping("/WebHooks")
@RestController
@RequiredArgsConstructor
@Slf4j
public class WebHooksReceiveController {


    private final ICallBackRecordService callBackRecordService;


    /**
     * 接收webhooks通知
     *
     * @param httpServletRequest httpServletRequest
     * @param requestBody        body
     * @return String String
     */
    @RequestMapping(value = "/{uuid}", method = {RequestMethod.GET, RequestMethod.POST})
    public String postWebhooksReceive(@PathVariable("uuid") String uuid,
                                      @RequestBody(required = false) String requestBody,
                                      HttpServletRequest httpServletRequest) {

        callBackRecordService.recordWebhooks(uuid, httpServletRequest, requestBody);

        return "success";

    }


}
