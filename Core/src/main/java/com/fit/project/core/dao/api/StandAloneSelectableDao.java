package com.fit.project.core.dao.api;

import java.util.List;

import com.fit.entity.bean.common.BaseBean;
import com.fit.entity.criteria.common.BaseCriteria;
import com.fit.exceptions.DAOException;

public interface StandAloneSelectableDao<T extends BaseBean, C extends BaseCriteria> {
	public T select(long primaryKey) throws DAOException;

	public T select(C criteria) throws DAOException;

	public List<T> selectList(C criteria) throws DAOException;

	public long selectCounts(C criteria) throws DAOException;
}
