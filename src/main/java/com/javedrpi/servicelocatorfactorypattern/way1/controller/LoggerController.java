package com.javedrpi.servicelocatorfactorypattern.way1.controller;

import com.javedrpi.servicelocatorfactorypattern.way1.model.LogStatement;
import com.javedrpi.servicelocatorfactorypattern.way1.service.StmtLoggerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Javed Ameen Shaikh
 * @website <a href="https://www.javedrpi.com/me">Portfolio</a>
 */

@RestController
@Slf4j
@RequiredArgsConstructor
public class LoggerController {
    private final StmtLoggerService stmtLoggerService;
    @GetMapping("/sysout")
    public String logViaSysout(){
        LogStatement sysoutLog = new LogStatement("SysoutInsertRecord", "Logging from SYSOUT !");
        stmtLoggerService.logStatement(sysoutLog);
        return "Statement is logged via SYSOUT";
    }

    @GetMapping("/sl4j")
    public String logViaSl4j(){
        LogStatement sl4jLog = new LogStatement("Sl4JInsertRecord", "Logging from SL4J !!");
        stmtLoggerService.logStatement(sl4jLog);
        return "Statement is logged via SL4J";
    }
}
