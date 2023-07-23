package com.javedrpi.servicelocatorfactorypattern.way1.service;

import com.javedrpi.servicelocatorfactorypattern.way1.model.LogStatement;
import org.springframework.stereotype.Service;

/**
 * @author Javed Ameen Shaikh
 * @website <a href="https://www.javedrpi.com/me">Portfolio</a>
 */

@Service("SysoutInsertRecord")
public class SysoutOutputLogger implements IOutputLogger<LogStatement>{
    @Override
    public void log(LogStatement logStatement) {
        System.out.println(logStatement.stmt());
    }
}
