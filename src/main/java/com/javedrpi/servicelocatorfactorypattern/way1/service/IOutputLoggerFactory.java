package com.javedrpi.servicelocatorfactorypattern.way1.service;

public interface IOutputLoggerFactory {
    <E> IOutputLogger<E> getOutputLogger(String loggerName);

}
