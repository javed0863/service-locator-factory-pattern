package com.javedrpi.servicelocatorfactorypattern.way2.service;

import java.util.List;

public interface IDbRepositoryFactory {
    <E> IInsertRecord<E> getDbRepository(String objectType);
    <E> IInsertRecord<E> getDbRepository(List<E> objectType);
}
