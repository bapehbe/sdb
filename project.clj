(defproject org.clojars.bapehbe/sdb "1.0.3-SNAPSHOT"
  :description "A Clojure library for working with Amazon SimpleDB"
  :dependencies [[log4j/log4j "1.2.15" :exclusions [javax.mail/mail
                                                   javax.jms/jms
                                                   com.sun.jdmk/jmxtools
                                                   com.sun.jmx/jmxri]]
                 [com.amazonaws/aws-java-sdk "1.1.0"]
                 [org.clojure/clojure "1.2.0"]
                 [com.google.code.typica/typica "1.5.2a"]]
  :dev-dependencies [[swank-clojure "1.2.1"]
                     [lein-clojars "0.5.0-SNAPSHOT"]]
  :source-path "src")
