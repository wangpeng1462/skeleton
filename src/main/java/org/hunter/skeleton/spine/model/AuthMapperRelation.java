package org.hunter.skeleton.spine.model;

import org.hunter.pocket.annotation.Column;
import org.hunter.pocket.annotation.Entity;
import org.hunter.pocket.annotation.ManyToOne;
import org.hunter.pocket.model.BaseEntity;

/**
 * @author wujianchuan 2019/2/3
 */
@Entity(table = "T_AUTH_MAPPER", tableId = 101)
public class AuthMapperRelation extends BaseEntity {
    private static final long serialVersionUID = 3635488973894838870L;
    @Column(name = "SERVER_ID")
    private String serverId;
    @ManyToOne(columnName = "AUTH_UUID", clazz = Authority.class, upBridgeField = "uuid")
    private String authUuid;
    @ManyToOne(columnName = "MAPPER_UUID", clazz = Mapper.class, upBridgeField = "uuid")
    private String mapperUuid;

    public AuthMapperRelation() {
    }

    public AuthMapperRelation(String serverId, String authUuid, String mapperUuid) {
        this.serverId = serverId;
        this.authUuid = authUuid;
        this.mapperUuid = mapperUuid;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getAuthUuid() {
        return authUuid;
    }

    public void setAuthUuid(String authUuid) {
        this.authUuid = authUuid;
    }

    public String getMapperUuid() {
        return mapperUuid;
    }

    public void setMapperUuid(String mapperUuid) {
        this.mapperUuid = mapperUuid;
    }
}
