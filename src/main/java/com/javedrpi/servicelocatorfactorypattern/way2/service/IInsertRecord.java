package com.javedrpi.servicelocatorfactorypattern.way2.service;

import java.util.List;

public interface IInsertRecord<E> {
    void insert(E rec);

    void insertAll(List<E> list);
}
