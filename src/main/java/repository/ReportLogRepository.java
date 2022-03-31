package repository;

import com.example.entity.ReportLog;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoRepository;
import io.smallrye.mutiny.Multi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Singleton;

@ApplicationScoped
public class ReportLogRepository  implements ReactivePanacheMongoRepository<ReportLog> {
//    Multi<ReportLog> findAllByReportLogKey(String reportLogKey);
//    Multi<ReportLog> findAllByMsisdn(String msisdn);
//    Multi<ReportLog> findAllByLevel(String level);

    public Multi<ReportLog> findAllByReportLogKey(String reportLogKey){
        return find(reportLogKey).stream();
    }

   public Multi<ReportLog> findAllByMsisdn(String msisdn) {
       return find(msisdn).stream();
   };

    public Multi<ReportLog> findAllByLevel(String level) {
        return find(level).stream();
    };
}
