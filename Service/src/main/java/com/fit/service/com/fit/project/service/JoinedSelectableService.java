package com.fit.service.com.fit.project.service;

import java.util.List;

import com.fit.entity.bean.common.BaseBean;
import com.fit.entity.criteria.common.BaseCriteria;
import com.fit.exceptions.BusinessException;
import com.fit.project.entity.util.FetchMode;
import com.fit.service.com.fit.project.service.common.BaseService;

public interface JoinedSelectableService<T extends BaseBean, C extends BaseCriteria> extends BaseService<T> {
	public T select(long primaryKey, FetchMode fetchMode) throws BusinessException;

	public T select(C criteria, FetchMode fetchMode) throws BusinessException;

	public List<T> selectList(C criteria, FetchMode fetchMode) throws BusinessException;

	public long selectCounts(C criteria, FetchMode fetchMode) throws BusinessException;
}
