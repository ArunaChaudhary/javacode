package com.fit.service.com.fit.project.service;

import com.fit.project.common.bean.BaseBean;
import com.fit.project.common.criteria.BaseCriteria;

public interface JoinedService<T extends BaseBean, C extends BaseCriteria> extends GenericService<T, C>, JoinedSelectableService<T, C> {

}
