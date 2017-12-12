package com.fit.project.core.dao.api;

import com.fit.entity.bean.common.BaseBean;
import com.fit.entity.criteria.common.BaseCriteria;
import com.fit.exceptions.ConsistencyViolationException;
import com.fit.exceptions.DAOException;
import com.fit.project.entity.util.FetchMode;

public interface RemovableDao<T extends BaseBean, C extends BaseCriteria> {

	public long delete(long primaryKey, long recordUpdId) throws ConsistencyViolationException, DAOException;

	public long delete(C criteria, FetchMode fetchMode, long recordUpdId) throws ConsistencyViolationException, DAOException;
}
