package top.misec.webhooks.service.impl;

import top.misec.webhooks.entity.WebhooksEvent;
import top.misec.webhooks.mapper.WebhooksEventMapper;
import top.misec.webhooks.service.IWebhooksEventService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Moshi
 * @since 2022-09-24
 */
@Service
public class WebhooksEventServiceImpl extends ServiceImpl<WebhooksEventMapper, WebhooksEvent> implements IWebhooksEventService {

}
