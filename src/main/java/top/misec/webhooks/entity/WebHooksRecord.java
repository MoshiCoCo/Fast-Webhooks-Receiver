package top.misec.webhooks.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * <p>
 * 回调记录表
 * </p>
 *
 * @author Moshi
 * @since 2022-09-23
 */
@Data
@TableName("webhooks_record")
public class WebHooksRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String eventId;
    private String body;
    private String header;
    private String parameter;

}
