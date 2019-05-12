package zzu.mavis.crm.coursetype.domain;

import zzu.mavis.crm.classes.domain.CrmClasses;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/*
`courseTypeId` varchar(255) NOT NULL,
  `courseCost` double DEFAULT NULL,
  `total` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `courseName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`courseTypeId`)
 */
public class CrmCourseType {
    private String courseTypeId;
    private String courseName;//课程类别的名称
    private Double courseCost;//费用
    private Integer total;//总学时
    private String remark;//标记，描述


    private Set<CrmClasses> crmClassesSet = new HashSet<>();

    public String getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(String courseTypeId) {
        this.courseTypeId = courseTypeId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Double getCourseCost() {
        return courseCost;
    }

    public void setCourseCost(Double courseCost) {
        this.courseCost = courseCost;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Set<CrmClasses> getCrmClassesSet() {
        return crmClassesSet;
    }

    public void setCrmClassesSet(Set<CrmClasses> crmClassesSet) {
        this.crmClassesSet = crmClassesSet;
    }

    @Override
    public String toString() {
        return "CrmCoursetype{" +
                "courseTypeId='" + courseTypeId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseCost=" + courseCost +
                ", total=" + total +
                ", remark='" + remark + '\'' +
                ", crmClassesSet=" + crmClassesSet +
                '}';
    }
}
