(ns clj-database-url.core-test
  (:require
   [clojure.test :refer :all]
   [clj-database-url.core]))

(deftest test-jdbc-database-url
  (testing "DATABASE_URL should be converted to JDBC_DATABASE_URL"
    (is (= "jdbc:postgresql://some.host.com:9999/some-database?user=some-user&password=some-password"
           (clj-database-url.core/jdbc-database-url
            "postgres://some-user:some-password@some.host.com:9999/some-database"))))

  (testing "DATABASE_URL should default to 5432 if no PORT supplied"
    (is (= "jdbc:postgresql://some.host.com:5432/some-database?user=some-user&password=some-password"
           (clj-database-url.core/jdbc-database-url
            "postgres://some-user:some-password@some.host.com/some-database"))))

  (testing "JDBC_DATABASE_URL should be returned if JDBC_DATABASE_URL is given"
    (is (= "jdbc:postgresql://some.host.com:5432/some-database?user=some-user&password=some-password"
           (clj-database-url.core/jdbc-database-url
            "jdbc:postgresql://some.host.com:5432/some-database?user=some-user&password=some-password")))))
