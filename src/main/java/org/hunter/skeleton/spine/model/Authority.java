package org.hunter.skeleton.spine.model;

import org.hunter.pocket.annotation.Column;
import org.hunter.pocket.annotation.Entity;
import org.hunter.pocket.annotation.OneToMany;
import org.hunter.pocket.model.BaseEntity;

import java.util.List;

/**
 * @author wujianchuan 2019/1/30
 */
@Entity(table = "T_AUTHORITY", tableId = 102)
public class Authority extends BaseEntity {
    private static final long serialVersionUID = 8811730322368476299L;
    @Column(name = "SERVER_ID")
    private String serverId;
    @Column(name = "BUNDLE_ID")
    private String bundleId;
    @Column(name = "ID")
    private String id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "COMMENT")
    private String comment;
    @OneToMany(clazz = AuthMapperRelation.class, bridgeField = "authUuid")
    private List<AuthMapperRelation> authMapperRelationList;
    @OneToMany(clazz = RoleAuthRelation.class, bridgeField = "authUuid")
    private List<RoleAuthRelation> roleAuthRelationList;

    public Authority() {
    }

    public Authority(String serverId, String bundleId, String id, String name, String comment) {
        this.serverId = serverId;
        this.bundleId = bundleId;
        this.id = id;
        this.name = name;
        this.comment = comment;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getBundleId() {
        return bundleId;
    }

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<AuthMapperRelation> getAuthMapperRelationList() {
        return authMapperRelationList;
    }

    public void setAuthMapperRelationList(List<AuthMapperRelation> authMapperRelationList) {
        this.authMapperRelationList = authMapperRelationList;
    }

    public List<RoleAuthRelation> getRoleAuthRelationList() {
        return roleAuthRelationList;
    }

    public void setRoleAuthRelationList(List<RoleAuthRelation> roleAuthRelationList) {
        this.roleAuthRelationList = roleAuthRelationList;
    }
}
