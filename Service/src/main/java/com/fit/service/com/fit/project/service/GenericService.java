package com.fit.service.com.fit.project.service;

import com.fit.entity.bean.common.BaseBean;
import com.fit.entity.criteria.common.BaseCriteria;

public interface GenericService<T extends BaseBean, C extends BaseCriteria> extends InsertableService<T>, UpdatableService<T, C>, RemovableService<T, C> {

}
