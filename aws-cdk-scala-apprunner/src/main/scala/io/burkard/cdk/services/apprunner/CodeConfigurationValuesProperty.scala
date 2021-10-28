package io.burkard.cdk.services.apprunner

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CodeConfigurationValuesProperty {

  def apply(
    startCommand: Option[String] = None,
    buildCommand: Option[String] = None,
    runtime: Option[String] = None,
    port: Option[String] = None,
    runtimeEnvironmentVariables: Option[List[_]] = None
  ): software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationValuesProperty =
    (new software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationValuesProperty.Builder)
      .startCommand(startCommand.orNull)
      .buildCommand(buildCommand.orNull)
      .runtime(runtime.orNull)
      .port(port.orNull)
      .runtimeEnvironmentVariables(runtimeEnvironmentVariables.map(_.asJava).orNull)
      .build()
}
