package io.burkard.cdk.services.networkfirewall

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogDestinationConfigProperty {

  def apply(
    logType: String,
    logDestinationType: String,
    logDestination: Map[String, String]
  ): software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LogDestinationConfigProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LogDestinationConfigProperty.Builder)
      .logType(logType)
      .logDestinationType(logDestinationType)
      .logDestination(logDestination.asJava)
      .build()
}
