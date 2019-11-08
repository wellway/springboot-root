package com.yalongz.entity;

import java.io.Serializable;
import java.util.Date;

public class NoticeInfo  implements Serializable {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	//请求ID（请求唯一ID，作请求追踪）
	private Long				reqid;
	//通知类型：1-披露，2-撤回
	private int					action;
	private String				bulletinType;
	//信披ID
	private String				bulletinId;

	private String				id;
	private String				type;
	private String				title;
	private String				signature;
	private Long				date;
	private Date				pubdate;

	private String				company;
	private String				fileKey;
	private Date				createtime;
	private Date				modifitime;


	public Long getReqid() {
		return reqid;
	}

	public void setReqid(Long reqid) {
		this.reqid = reqid;
	}

	public int getAction() {
		return action;
	}

	public void setAction(int action) {
		this.action = action;
	}

	public String getBulletinType() {
		return bulletinType;
	}

	public void setBulletinType(String bulletinType) {
		this.bulletinType = bulletinType;
	}

	public String getBulletinId() {
		return bulletinId;
	}

	public void setBulletinId(String bulletinId) {
		this.bulletinId = bulletinId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public Long getDate() {
		return date;
	}

	public void setDate(Long date) {
		this.date = date;
	}

	public Date getPubdate() {
		return pubdate;
	}

	public void setPubdate(Date pubdate) {
		this.pubdate = pubdate;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getFileKey() {
		return fileKey;
	}

	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getModifitime() {
		return modifitime;
	}

	public void setModifitime(Date modifitime) {
		this.modifitime = modifitime;
	}

	@Override
	public String toString() {
		return "NoticeInfo [reqid=" + reqid + ", action=" + action + ", bulletinType=" + bulletinType + ", bulletinId=" + bulletinId + ", id=" + id + ", type=" + type + ", title=" + title + ", signature=" + signature + ", date=" + date + ", pubdate=" + pubdate + ", company=" + company + ", fileKey=" + fileKey + ", createtime=" + createtime + ", modifitime=" + modifitime + "]";
	}

	
}
