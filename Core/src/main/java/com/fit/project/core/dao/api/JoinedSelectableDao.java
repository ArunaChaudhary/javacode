package com.fit.project.core.dao.api;

import java.util.List;

import com.fit.entity.bean.common.BaseBean;
import com.fit.entity.criteria.common.BaseCriteria;
import com.fit.exceptions.DAOException;
import com.fit.project.core.util.FetchMode;

public interface JoinedSelectableDao<T extends BaseBean, C extends BaseCriteria> {

	public T select(long primaryKey, FetchMode fetchMode) throws DAOException;

	public T select(C criteria, FetchMode fetchMode) throws DAOException;

	public List<T> selectList(C criteria, FetchMode fetchMode) throws DAOException;

	public long selectCounts(C criteria, FetchMode fetchMode) throws DAOException;
}
