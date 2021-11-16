package io.burkard.cdk.services.apprunner

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodeConfigurationValuesProperty {

  def apply(
    runtime: String,
    startCommand: Option[String] = None,
    buildCommand: Option[String] = None,
    port: Option[String] = None,
    runtimeEnvironmentVariables: Option[List[_]] = None
  ): software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationValuesProperty =
    (new software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationValuesProperty.Builder)
      .runtime(runtime)
      .startCommand(startCommand.orNull)
      .buildCommand(buildCommand.orNull)
      .port(port.orNull)
      .runtimeEnvironmentVariables(runtimeEnvironmentVariables.map(_.asJava).orNull)
      .build()
}
