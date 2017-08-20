package com.ailin.model;
import java.util.Date;

/**
 * Created by HanHan on 2017/8/7.
 */
public class Message {
    private Integer id;

    private Date createTime;

    private Date lastUpdate;

    private Byte visibility;

    private Integer fromId;

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", lastUpdate=" + lastUpdate +
                ", visibility=" + visibility +
                ", fromId=" + fromId +
                ", toId=" + toId +
                ", content='" + content + '\'' +
                ", type=" + type +
                '}';
    }

    private Integer toId;

    private String content;

    private Byte type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Byte getVisibility() {
        return visibility;
    }

    public void setVisibility(Byte visibility) {
        this.visibility = visibility;
    }

    public Integer getFromId() {
        return fromId;
    }

    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    public Integer getToId() {
        return toId;
    }

    public void setToId(Integer toId) {
        this.toId = toId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }
}
