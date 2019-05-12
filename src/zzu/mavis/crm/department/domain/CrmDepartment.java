package zzu.mavis.crm.department.domain;
/*
 `depId` varchar(255) NOT NULL,
  `depName` varchar(255) DEFAULT NULL,
 */

import zzu.mavis.crm.post.domain.CrmPost;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CrmDepartment {
   private String depId;//部门编号
    private String depName;//部门名称
    //一对多：一个部门 对 多个职务，选择集合set：原因是不重复，无顺序，不必花费资源维护它的顺序
    private Set<CrmPost> postSet= new HashSet<CrmPost>();//new一个以方便以后的操作，不实例化也可以

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Set<CrmPost> getPostSet() {
        return postSet;
    }

    public void setPostSet(Set<CrmPost> postSet) {
        this.postSet = postSet;
    }

    @Override
    public String toString() {
        return "CrmDepartment{" +
                "depId='" + depId + '\'' +
                ", depName='" + depName + '\'' +
                ", postSet=" + postSet +
                '}';
    }
}
