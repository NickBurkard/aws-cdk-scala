package io.burkard.cdk.services.apprunner

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ImageConfigurationProperty {

  def apply(
    startCommand: Option[String] = None,
    port: Option[String] = None,
    runtimeEnvironmentVariables: Option[List[_]] = None
  ): software.amazon.awscdk.services.apprunner.CfnService.ImageConfigurationProperty =
    (new software.amazon.awscdk.services.apprunner.CfnService.ImageConfigurationProperty.Builder)
      .startCommand(startCommand.orNull)
      .port(port.orNull)
      .runtimeEnvironmentVariables(runtimeEnvironmentVariables.map(_.asJava).orNull)
      .build()
}
