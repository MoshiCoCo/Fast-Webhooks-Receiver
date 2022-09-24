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
@TableName("call_back_record")
public class CallBackRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String callBackUuid;

    private String callBackBody;

    private String callBackHeader;

}
