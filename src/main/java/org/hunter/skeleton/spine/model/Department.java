package org.hunter.skeleton.spine.model;

import org.hunter.pocket.annotation.Column;
import org.hunter.pocket.annotation.Entity;
import org.hunter.pocket.annotation.Join;
import org.hunter.pocket.constant.JoinMethod;
import org.hunter.pocket.model.BaseEntity;

/**
 * @author wujianchuan
 */
@Entity(table = "T_DEPARTMENT", tableId = 112, businessName = "部门")
public class Department extends BaseEntity {
    private static final long serialVersionUID = -893404050854935292L;
    @Column(name = "PARENT_UUID", businessName = "父节点标识")
    private String parentUuid;
    @Join(columnName = "PARENT_UUID",columnSurname = "PARENT_NAME",businessName = "父节点名称",joinTable = "T_DEPARTMENT",joinTableSurname = "T1",joinMethod = JoinMethod.LEFT,bridgeColumn = "UUID",destinationColumn = "NAME")
    private String parentName;
    @Column(name = "NAME", businessName = "名称")
    private String name;
    @Column(name = "SPELL", businessName = "拼音码")
    private String spell;
    @Column(name = "SORT", businessName = "排序码")
    private Integer sort;
    @Column(name = "ENABLE", businessName = "启用")
    private Boolean enable;
    @Column(name = "IS_QC", businessName = "是否质控科室")
    private Boolean controlQuality;
    @Column(name = "IS_PURCHASE", businessName = "是否采购科室")
    private Boolean controlPurchase;
    @Column(name = "IS_CHILD", businessName = "是否含子节点")
    private Boolean hasChild;
    @Column(name = "SYSTEM_CODE", businessName = "业务系统对照")
    private String systemCode;
    @Column(name = "LEADER", businessName = "部门领导")
    private String leader;

    public String getParentUuid() {
        return parentUuid;
    }

    public void setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Boolean getControlQuality() {
        return controlQuality;
    }

    public void setControlQuality(Boolean controlQuality) {
        this.controlQuality = controlQuality;
    }

    public Boolean getControlPurchase() {
        return controlPurchase;
    }

    public void setControlPurchase(Boolean controlPurchase) {
        this.controlPurchase = controlPurchase;
    }

    public Boolean getHasChild() {
        return hasChild;
    }

    public void setHasChild(Boolean hasChild) {
        this.hasChild = hasChild;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }
}
