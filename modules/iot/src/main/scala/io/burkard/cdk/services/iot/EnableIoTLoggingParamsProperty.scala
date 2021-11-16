package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EnableIoTLoggingParamsProperty {

  def apply(
    roleArnForLogging: String,
    logLevel: String
  ): software.amazon.awscdk.services.iot.CfnMitigationAction.EnableIoTLoggingParamsProperty =
    (new software.amazon.awscdk.services.iot.CfnMitigationAction.EnableIoTLoggingParamsProperty.Builder)
      .roleArnForLogging(roleArnForLogging)
      .logLevel(logLevel)
      .build()
}
