package io.burkard.cdk.services.networkfirewall

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoggingConfigurationProperty {

  def apply(
    logDestinationConfigs: Option[List[_]] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LoggingConfigurationProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LoggingConfigurationProperty.Builder)
      .logDestinationConfigs(logDestinationConfigs.map(_.asJava).orNull)
      .build()
}
