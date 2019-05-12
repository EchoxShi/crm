package zzu.mavis.crm.post.domain;

import zzu.mavis.crm.department.domain.CrmDepartment;
import zzu.mavis.crm.staff.staff.domain.CrmStaff;

import java.util.HashSet;
import java.util.Set;

/*
CREATE TABLE `crm_post` (
  `postId` varchar(255) NOT NULL,
  `postName` varchar(255) DEFAULT NULL,
  `depId` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`postId`),
  KEY `FKgk6yh1w0w92hb9kmmh5fof8h6` (`depId`),
  CONSTRAINT `FKgk6yh1w0w92hb9kmmh5fof8h6` FOREIGN KEY (`depId`) REFERENCES `crm_department` (`depId`)
 */
public class CrmPost {
    private String postId;
    private String postName;//职务名称
    //多对一：对个职务 对 一个部门，以对象的方式描述
    private CrmDepartment department;
    //  一对多：一个职务 对 多个员工
    private Set<CrmStaff> staffSet = new HashSet<>();

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public CrmDepartment getDepartment() {
        return department;
    }

    public void setDepartment(CrmDepartment department) {
        this.department = department;
    }

    public Set<CrmStaff> getStaffSet() {
        return staffSet;
    }

    public void setStaffSet(Set<CrmStaff> staffSet) {
        this.staffSet = staffSet;
    }

    @Override
    public String toString() {
        return "CrmPost{" +
                "postId='" + postId + '\'' +
                ", postName='" + postName + '\'' +
                ", department=" + department +
                ", staffSet=" + staffSet +
                '}';
    }
}
