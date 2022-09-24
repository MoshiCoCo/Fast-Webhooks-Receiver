package top.misec.webhooks.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author Moshi
 * @since 2022-09-24
 */
@TableName("webhooks_event")
public class WebhooksEvent implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String eventId;

    private String eventName;

    private String method;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "WebhooksEvent{" +
                "id = " + id +
                ", eventId = " + eventId +
                ", eventName = " + eventName +
                ", method = " + method +
                ", createTime = " + createTime +
                ", updateTime = " + updateTime +
                "}";
    }
}
