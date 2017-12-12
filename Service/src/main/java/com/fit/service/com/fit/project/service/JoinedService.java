package com.fit.service.com.fit.project.service;

import com.fit.entity.bean.common.BaseBean;
import com.fit.entity.criteria.common.BaseCriteria;

public interface JoinedService<T extends BaseBean, C extends BaseCriteria> extends GenericService<T, C>, JoinedSelectableService<T, C> {

}
