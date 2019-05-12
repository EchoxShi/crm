package zzu.mavis.crm.staff.staff.domain;

import zzu.mavis.crm.post.domain.CrmPost;

import java.util.Date;

/*
CREATE TABLE `crm_staff` (
  `staffId` varchar(255) NOT NULL,
  `staffName` varchar(255) DEFAULT NULL,
  `loginName` varchar(255) DEFAULT NULL,
  `loginPwd` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `onDutyDate` datetime(6) DEFAULT NULL,
  `postId` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`staffId`),
  KEY `FKtrgxem3u7h6d33d9hpymksl01` (`postId`),
  CONSTRAINT `FKtrgxem3u7h6d33d9hpymksl01` FOREIGN KEY (`postId`) REFERENCES `crm_post` (`postId`)
 */
public class CrmStaff {
    private String staffId;
    private String staffName;//员工姓名
    private String loginName;//员工登录名
    private String loginPwd;//员工登录密码
    private String gender;//员工性别
    private Date onDutyDate;//员工入职时间
    private String postId;

    // 多对一：多个员工 对 一个职务
    private CrmPost post;

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getOnDutyDate() {
        return onDutyDate;
    }

    public void setOnDutyDate(Date onDutyDate) {
        this.onDutyDate = onDutyDate;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public CrmPost getPost() {
        return post;
    }

    public void setPost(CrmPost post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "CrmStaff{" +
                "staffId='" + staffId + '\'' +
                ", staffName='" + staffName + '\'' +
                ", loginName='" + loginName + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                ", gender='" + gender + '\'' +
                ", onDutyDate=" + onDutyDate +
                ", postId='" + postId + '\'' +
                ", post=" + post +
                '}';
    }
}
