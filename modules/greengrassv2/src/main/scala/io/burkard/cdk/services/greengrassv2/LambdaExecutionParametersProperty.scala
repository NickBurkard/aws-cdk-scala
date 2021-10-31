package io.burkard.cdk.services.greengrassv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaExecutionParametersProperty {

  def apply(
    environmentVariables: Option[Map[String, String]] = None,
    execArgs: Option[List[String]] = None,
    inputPayloadEncodingType: Option[String] = None,
    eventSources: Option[List[_]] = None,
    maxIdleTimeInSeconds: Option[Number] = None,
    statusTimeoutInSeconds: Option[Number] = None,
    pinned: Option[Boolean] = None,
    linuxProcessParams: Option[software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaLinuxProcessParamsProperty] = None,
    maxQueueSize: Option[Number] = None,
    timeoutInSeconds: Option[Number] = None,
    maxInstancesCount: Option[Number] = None
  ): software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaExecutionParametersProperty =
    (new software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaExecutionParametersProperty.Builder)
      .environmentVariables(environmentVariables.map(_.asJava).orNull)
      .execArgs(execArgs.map(_.asJava).orNull)
      .inputPayloadEncodingType(inputPayloadEncodingType.orNull)
      .eventSources(eventSources.map(_.asJava).orNull)
      .maxIdleTimeInSeconds(maxIdleTimeInSeconds.orNull)
      .statusTimeoutInSeconds(statusTimeoutInSeconds.orNull)
      .pinned(pinned.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .linuxProcessParams(linuxProcessParams.orNull)
      .maxQueueSize(maxQueueSize.orNull)
      .timeoutInSeconds(timeoutInSeconds.orNull)
      .maxInstancesCount(maxInstancesCount.orNull)
      .build()
}
