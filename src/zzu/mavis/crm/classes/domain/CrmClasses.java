package zzu.mavis.crm.classes.domain;

import zzu.mavis.crm.coursetype.domain.CrmCourseType;

import java.util.Date;
import java.util.Set;

/*
 `classId` varchar(255) NOT NULL,
  `beginTime` datetime(6) DEFAULT NULL,
  `endTime` datetime(6) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `totalCount` int(11) DEFAULT NULL,
  `upgradeCount` int(11) DEFAULT NULL,
  `changeCount` int(11) DEFAULT NULL,
  `runoffCount` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `uploadTime` datetime DEFAULT NULL,
  `uploadPath` varchar(255) DEFAULT NULL,
  `uploadFileName` varchar(255) DEFAULT NULL,
  `courseTypeId` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`classId`),
  KEY `FKat667kro8saq6oq1pjy91j90g` (`courseTypeId`),
 */
public class CrmClasses {
    private String classId;

    private String name;//课程名称
    private Date beginTime;//开班时间
    private Date endTime;//结业时间

    private String status;//状态
    private Integer totalCount;//总人数
    private Integer upgradeCount;//升级数

    private Integer changeCount;//转来的，转班数
    private Integer runoffCount;//流失数
    private String remark;//描述

    private Date uploadTime;//上传时间
    private String uploadPath;//上传课表路径
    private String uploadFileName;//上传课表名称

    private CrmCourseType crmCourseType;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getUpgradeCount() {
        return upgradeCount;
    }

    public void setUpgradeCount(Integer upgradeCount) {
        this.upgradeCount = upgradeCount;
    }

    public Integer getChangeCount() {
        return changeCount;
    }

    public void setChangeCount(Integer changeCount) {
        this.changeCount = changeCount;
    }

    public Integer getRunoffCount() {
        return runoffCount;
    }

    public void setRunoffCount(Integer runoffCount) {
        this.runoffCount = runoffCount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getUploadPath() {
        return uploadPath;
    }

    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public CrmCourseType getCrmCoursetype() {
        return crmCourseType;
    }

    public void setCrmCoursetype(CrmCourseType crmCoursetype) {
        this.crmCourseType = crmCourseType;
    }

    @Override
    public String toString() {
        return "CrmClasses{" +
                "classId='" + classId + '\'' +
                ", name='" + name + '\'' +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", status='" + status + '\'' +
                ", totalCount=" + totalCount +
                ", upgradeCount=" + upgradeCount +
                ", changeCount=" + changeCount +
                ", runoffCount=" + runoffCount +
                ", remark='" + remark + '\'' +
                ", uploadTime=" + uploadTime +
                ", uploadPath='" + uploadPath + '\'' +
                ", uploadFileName='" + uploadFileName + '\'' +
                ", crmCoursetype=" + crmCourseType +
                '}';
    }
}
