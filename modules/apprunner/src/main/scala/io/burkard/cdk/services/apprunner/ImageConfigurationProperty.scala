package io.burkard.cdk.services.apprunner

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
