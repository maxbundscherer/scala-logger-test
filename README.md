# Scala logger test

[![Travis](https://img.shields.io/travis/rust-lang/rust.svg)](#)
[![shields.io](http://img.shields.io/badge/license-Apache2-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.txt)

**A project to test different log-levels. Tests are run in an interval-controlled manner.**

Author: Maximilian Bundscherer (https://bundscherer-online.de)

## Description

Project is written in **scala**. Used log-library: **Apache Log4j 2**.

SBT is required.

- Run project with ``sbt run``
- Test project (*no test needed*) with ``sbt clean coverage test``
- Generate coverage report(s) (*no test needed*) with ``sbt coverageReport``
- Docker local publish with ``sbt docker:publishLocal``
- (Opt) See logger config in ``src/main/resources/log4j.properties``
- (Opt) See interval config in ``src/main/resources/application.conf``

## Features

- Docker local publish included
- Tests are run in an interval-controlled manner
- Test different logger-levels (see [log4j logLevels](https://logging.apache.org/log4j/2.x/manual/customloglevels.html))
    - FATAL
    - ERROR
    - WARN
    - INFO
    - DEBUG
    - TRACE