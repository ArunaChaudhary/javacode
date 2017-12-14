package com.fit.project.common.criteria;

import java.util.List;

public class BaseCriteria {

	public enum Order {
		ASC("ASC"), DESC("DESC");

		private String value;

		private Order(String value) {
			this.value = value;
		}

		public String getValue() {
			return this.value;
		}

	}

	private Long id;
	private long offset;
	private long limit;
	private String word;
	private List<Long> includeIds;
	private List<Long> excludeIds;
	private String orderBy;
	private Order order;

	public BaseCriteria() {
		offset = -1;
		limit = 0;
		order = Order.ASC;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getOffset() {
		return offset;
	}

	public void setOffset(long offset) {
		this.offset = offset;
	}

	public long getLimit() {
		return limit;
	}

	public void setLimit(long limit) {
		this.limit = limit;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public List<Long> getIncludeIds() {
		return includeIds;
	}

	public void setIncludeIds(List<Long> includeIds) {
		this.includeIds = includeIds;
	}

	public List<Long> getExcludeIds() {
		return excludeIds;
	}

	public void setExcludeIds(List<Long> excludeIds) {
		this.excludeIds = excludeIds;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "BaseCriteria [id=" + id + ", offset=" + offset + ", limit=" + limit + ", word=" + word + ", includeIds=" + includeIds + ", excludeIds=" + excludeIds + ", orderBy="
				+ orderBy + ", order=" + order + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
