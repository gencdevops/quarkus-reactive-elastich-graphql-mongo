package com.example.api;

import com.example.entity.ReportLog;
import com.example.service.ReportLogService;
import io.smallrye.mutiny.Multi;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;

import javax.inject.Inject;


@Slf4j


@GraphQLApi
public class GraphQlResolver {

    @Inject
     ReportLogService reportLogService;

    //@SchemaMapping(typeName = "Query", field = "reportLog")
//    @Query
//    Multi<ReportLog> wholeReports(){
//        return this.reportLogService.retrieveWholeLogs();
//    }

    @Query
   public Multi<ReportLog> reportLogsByReportKey(@Name("reportLogKey") String reportLogKey){
        return this.reportLogService.retrieveByReportKey(reportLogKey);
    }

    @Query
    public Multi<ReportLog> reportLogsByMsisdn(@Name("msisdn") String msisdn){
        return this.reportLogService.retrieveByMsisdn(msisdn);
    }

    @Query
    public Multi<ReportLog> reportLogsByInfoLevel(@Name("level") String level){
        return this.reportLogService.retrieveByLevel(level);
    }
}