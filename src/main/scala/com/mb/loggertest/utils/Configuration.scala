package com.mb.loggertest.utils

import com.typesafe.config.ConfigFactory

trait Configuration {

  protected val config = ConfigFactory.load()

  val loggerConfig = config.getConfig("logger")

  val delayBetweenTest = loggerConfig.getInt("delay-between-test-in-seconds")

}