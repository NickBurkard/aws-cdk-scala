package io.burkard.cdk.services.networkfirewall

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoggingConfigurationProperty {

  def apply(
    logDestinationConfigs: Option[List[_]] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LoggingConfigurationProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LoggingConfigurationProperty.Builder)
      .logDestinationConfigs(logDestinationConfigs.map(_.asJava).orNull)
      .build()
}
