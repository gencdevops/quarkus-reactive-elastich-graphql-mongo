
 db.reportLog.insertMany([
 {"id" : "1", "level" : "INFO", "thread" : "thread1", "traceId" : "trace1", "spanId" : "span1", "sessionId" : "session1" , "msisdn" : "5332100342" , "clientIp" : "127.0.0.1" , "channel" : "DO" ,"language" : "TR" , "source" : "Balance" , "message" , "balance-report-key for getting data" , "reportLogKey" : "balanceReport"  },
 {"id" : "2", "level" : "EROR", "thread" : "thread2", "traceId" : "trace2", "spanId" : "span2", "sessionId" : "session2" , "msisdn" : "5332100365" , "clientIp" : "127.0.0.1" , "channel" : "DO" ,"language" : "TR" , "source" : "Balance" , "message" , "balance-report-key for business Logic" , "reportLogKey" : "balanceReport"  },
 {"id" : "3", "level" : "WAR", "thread" : "thread3", "traceId" : "trace3", "spanId" : "span3", "sessionId" : "session3" , "msisdn" : "5332100312" , "clientIp" : "127.0.0.1" , "channel" : "DO" ,"language" : "TR" , "source" : "Balance" , "message" , "balance-report-key error for service call" , "reportLogKey" : "balanceReport"  },
 {"id" : "4", "level" : "INFO", "thread" : "thread4", "traceId" : "trace4", "spanId" : "span4", "sessionId" : "session4" , "msisdn" : "5332100100" , "clientIp" : "127.0.0.1" , "channel" : "DO" ,"language" : "TR" , "source" : "Balance" , "message" , "balance-report-key info" , "reportLogKey" : "balanceReport"  },

 ])

