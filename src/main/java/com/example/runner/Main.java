package com.example.runner;

import com.example.entity.ReportLog;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

import java.util.ArrayList;
import java.util.List;


@QuarkusMain
public class Main {
    public static void main(String... args) {
        Quarkus.run(MyApp.class, args);
    }

    public static class MyApp implements QuarkusApplication {

        @Override
        public int run(String... args) throws Exception {
            System.out.println("Do startup logic here");
            System.out.println("hello command line runner");
            List<ReportLog> reportLogList = new ArrayList<>();




            ReportLog.persist(reportLogList);

            Quarkus.waitForExit();
            return 0;
        }
    }
}


