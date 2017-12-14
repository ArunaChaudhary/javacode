package com.fit.service.com.fit.project.service;

import com.fit.project.common.bean.BaseBean;
import com.fit.project.common.criteria.BaseCriteria;

public interface StandAloneService<T extends BaseBean, C extends BaseCriteria> extends GenericService<T, C>, StandAloneSelectableService<T, C> {

}
