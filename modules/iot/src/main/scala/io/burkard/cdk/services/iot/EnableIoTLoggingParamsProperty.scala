package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EnableIoTLoggingParamsProperty {

  def apply(
    roleArnForLogging: Option[String] = None,
    logLevel: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnMitigationAction.EnableIoTLoggingParamsProperty =
    (new software.amazon.awscdk.services.iot.CfnMitigationAction.EnableIoTLoggingParamsProperty.Builder)
      .roleArnForLogging(roleArnForLogging.orNull)
      .logLevel(logLevel.orNull)
      .build()
}
