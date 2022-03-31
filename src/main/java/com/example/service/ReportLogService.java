package com.example.service;

import com.example.entity.ReportLog;
import io.smallrye.mutiny.Multi;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import repository.ReportLogRepository;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Singleton
@RequiredArgsConstructor
public class ReportLogService {


    private final ReportLogRepository reportLogRepository;


//    public Multi<ReportLog> retrieveWholeLogs(){
//        return reportLogRepository.findAll();
//    }

    public Multi<ReportLog> retrieveByReportKey(String reportKey){
        return reportLogRepository.findAllByReportLogKey(reportKey);
    }

    public Multi<ReportLog> retrieveByMsisdn(String msisdn){
        return reportLogRepository.findAllByMsisdn(msisdn);
    }

    public Multi<ReportLog> retrieveByLevel(String level){
        return reportLogRepository.findAllByLevel(level);
    }


}
