package com.fit.service.com.fit.project.service;

import com.fit.exceptions.BusinessException;
import com.fit.exceptions.ConsistencyViolationException;
import com.fit.project.common.bean.BaseBean;
import com.fit.project.common.criteria.BaseCriteria;
import com.fit.project.common.util.FetchMode;
import com.fit.service.com.fit.project.service.common.BaseService;

public interface RemovableService<T extends BaseBean, C extends BaseCriteria> extends BaseService<T> {
	public long delete(long id, long recordUpdId) throws ConsistencyViolationException, BusinessException;

	public long delete(C criteria, FetchMode fetchMode, long recordUpdId) throws ConsistencyViolationException, BusinessException;
}
