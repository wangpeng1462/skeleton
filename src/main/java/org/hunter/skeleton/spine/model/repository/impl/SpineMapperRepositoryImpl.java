package org.hunter.skeleton.spine.model.repository.impl;

import org.hunter.skeleton.annotation.Service;
import org.hunter.skeleton.repository.AbstractRepository;
import org.hunter.skeleton.spine.model.Mapper;
import org.hunter.skeleton.spine.model.repository.SpineMapperRepository;

import java.sql.SQLException;
import java.util.List;

/**
 * @author wujianchuan 2019/2/21
 */
@Service(session = "skeleton")
public class SpineMapperRepositoryImpl extends AbstractRepository implements SpineMapperRepository {
    @Override
    public Mapper findOne(String uuid) throws SQLException {
        return (Mapper) this.getSession().findOne(Mapper.class, uuid);
    }
}
