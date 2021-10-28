package io.burkard.cdk.services.networkfirewall

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LogDestinationConfigProperty {

  def apply(
    logType: Option[String] = None,
    logDestinationType: Option[String] = None,
    logDestination: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LogDestinationConfigProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LogDestinationConfigProperty.Builder)
      .logType(logType.orNull)
      .logDestinationType(logDestinationType.orNull)
      .logDestination(logDestination.map(_.asJava).orNull)
      .build()
}
