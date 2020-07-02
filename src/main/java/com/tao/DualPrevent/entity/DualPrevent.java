package com.tao.DualPrevent.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-05-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("DualPrevent")
public class DualPrevent implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("Indexed")
    private String Indexed;

    @TableField("Main")
    private String Main;

    @TableField("Created")
    private String Created;

    @TableField("ScoreStandard")
    private String ScoreStandard;

    @TableField("Way")
    private String Way;

    /**
     * 自我问题
     */
    @TableField("SelfProblem")
    private String SelfProblem;

    /**
     * 自我演绎
     */
    @TableField("SelfDeduction")
    private String SelfDeduction;

    /**
     * 自我建议
     */
    @TableField("SelfReformAdvice")
    private String SelfReformAdvice;

    /**
     * 其他
     */
    @TableField("OtherProblem")
    private String OtherProblem;

    /**
     * 其他扣除
     */
    @TableField("OtherDeduction")
    private String OtherDeduction;

    /**
     * 其他改革建议
     */
    @TableField("OtherReformAdvice")
    private String OtherReformAdvice;

    /**
     * 模板ID
     */
    @TableField("TemplateID")
    private String TemplateID;

    /**
     * 风险管控制度
     */
    @TableField("LevelPath")
    private String LevelPath;

    /**
     * 隐患排查制度
     */
    @TableField("RemovePath")
    private String RemovePath;

    /**
     * 安全生产奖惩制度
     */
    @TableField("ProducePath")
    private String ProducePath;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private String CreateTime;

    @TableField("Status")
    private String Status;

    @TableField("CheckTime")
    private String CheckTime;

    /**
     * 用户id
     */
    @TableField("EnterpriseID")
    private String EnterpriseID;

    @TableField("TransportType")
    private String TransportType;

    /**
     * 评价机构id
     */
    @TableField("AssessID")
    private String AssessID;

    @TableField("CheckTypeID")
    private String CheckTypeID;

    @TableField("Result")
    private String Result;

    /**
     * 自我报告路径
     */
    @TableField("SelfReportPath")
    private String SelfReportPath;

    /**
     * 检查报告路径
     */
    @TableField("CheckReportPath")
    private String CheckReportPath;


}
