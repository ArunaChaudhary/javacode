package com.fit.service.com.fit.project.service;

import com.fit.entity.bean.common.BaseBean;
import com.fit.entity.criteria.common.BaseCriteria;
import com.fit.exceptions.BusinessException;
import com.fit.exceptions.ConsistencyViolationException;
import com.fit.project.entity.util.FetchMode;
import com.fit.service.com.fit.project.service.common.BaseService;

public interface RemovableService<T extends BaseBean, C extends BaseCriteria> extends BaseService<T> {
	public long delete(long id, long recordUpdId) throws ConsistencyViolationException, BusinessException;

	public long delete(C criteria, FetchMode fetchMode, long recordUpdId) throws ConsistencyViolationException, BusinessException;
}
