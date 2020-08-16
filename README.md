# clj-database-url

[![Build Status](https://travis-ci.org/kwrooijen/clj-database-url.svg?branch=master)](https://travis-ci.org/kwrooijen/clj-database-url)
[![codecov](https://codecov.io/gh/kwrooijen/clj-database-url/branch/master/graph/badge.svg)](https://codecov.io/gh/kwrooijen/clj-database-url)
[![Clojars Project](https://img.shields.io/clojars/v/clj-database-url.svg)](https://clojars.org/kwrooijen/clj-database-url)

## Usage

### Convert a standard DATABASE_URL to JDBC_DATABASE_URL

```clojure
(clj-database-url.core/jdbc-database-url
 "postgres://some-user:some-password@some.host.com:9999/some-database")
;=> "jdbc:postgresql://some.host.com:9999/some-database?user=some-user&password=some-password"
```
### If no port is supplied, default to 5432 (Postgres)

```clojure
(clj-database-url.core/jdbc-database-url
 "postgres://some-user:some-password@some.host.com/some-database")
;=> "jdbc:postgresql://some.host.com:5432/some-database?user=some-user&password=some-password"
```

### If url is already JDBC compliant, return that

```clojure
(clj-database-url.core/jdbc-database-url
 "jdbc:postgresql://some.host.com:5432/some-database?user=some-user&password=some-password")
;=> "jdbc:postgresql://some.host.com:5432/some-database?user=some-user&password=some-password"

```

## Author / License

Released under the [MIT License] by [Kevin William van Rooijen].

[Kevin William van Rooijen]: https://twitter.com/kwrooijen

[MIT License]: https://github.com/kwrooijen/clj-database-url/blob/master/LICENSE
