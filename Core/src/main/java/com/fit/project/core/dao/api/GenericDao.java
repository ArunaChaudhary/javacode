package com.fit.project.core.dao.api;

import com.fit.entity.bean.common.BaseBean;
import com.fit.entity.criteria.common.BaseCriteria;

public interface GenericDao<T extends BaseBean, C extends BaseCriteria> extends InsertableDao<T>, UpdateableDao<T, C>, RemovableDao<T, C> {

}
