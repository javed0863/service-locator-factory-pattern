package com.javedrpi.servicelocatorfactorypattern.way1.service;

import com.javedrpi.servicelocatorfactorypattern.way1.model.LogStatement;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Javed Ameen Shaikh
 * @website <a href="https://www.javedrpi.com/me">Portfolio</a>
 */

@Slf4j
@Service("Sl4JInsertRecord")
public class Sl4jOutputLogger implements IOutputLogger<LogStatement>{
    @Override
    public void log(LogStatement event) {
        log.info(event.stmt());
    }
}
