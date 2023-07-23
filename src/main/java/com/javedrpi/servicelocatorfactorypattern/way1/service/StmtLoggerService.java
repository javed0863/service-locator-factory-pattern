package com.javedrpi.servicelocatorfactorypattern.way1.service;

import com.javedrpi.servicelocatorfactorypattern.way1.model.LogStatement;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Javed Ameen Shaikh
 * @website <a href="https://www.javedrpi.com/me">Portfolio</a>
 */

@Service
@RequiredArgsConstructor
public class StmtLoggerService {
    private final IOutputLoggerFactory factory;

    public void logStatement(LogStatement logStatement){
        factory.getOutputLogger(logStatement.type()).log(logStatement);
    }
}
