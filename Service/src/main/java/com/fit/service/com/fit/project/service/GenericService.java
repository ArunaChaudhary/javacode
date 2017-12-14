package com.fit.service.com.fit.project.service;

import com.fit.project.common.bean.BaseBean;
import com.fit.project.common.criteria.BaseCriteria;

public interface GenericService<T extends BaseBean, C extends BaseCriteria> extends InsertableService<T>, UpdatableService<T, C>, RemovableService<T, C> {

}
