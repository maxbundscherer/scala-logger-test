package com.mb.loggertest

import com.mb.loggertest.utils.Configuration

import org.apache.log4j.Logger

object Main extends App with Configuration  {

  private val log: Logger = Logger.getLogger(this.getClass.getSimpleName)

  log.info("Init - Test all loggers (6 loggers) - Every " + delayBetweenTest + " seconds")

  var counter: Long = 0

  do {

    log.fatal ("(1/6) Fatal test message (times: " + counter + ")")
    log.error ("(2/6) Error test message (times: " + counter + ")")
    log.warn  ("(3/6) Warn test message (times: " + counter + ")")
    log.info  ("(4/6) Info test message (times: " + counter + ")")
    log.debug ("(5/6) Debug test message (times: " + counter + ")")
    log.trace ("(6/6) Trace test message (times: " + counter + ")")

    counter += 1
    Thread.sleep(delayBetweenTest * 1000)

  } while(true)

}