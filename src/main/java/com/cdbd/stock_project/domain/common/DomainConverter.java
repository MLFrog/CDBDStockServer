package com.cdbd.stock_project.domain.common;

public interface DomainConverter<A, B> {
	B convert(A a);
}