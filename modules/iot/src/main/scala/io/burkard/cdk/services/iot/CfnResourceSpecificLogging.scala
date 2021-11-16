package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceSpecificLogging {

  def apply(
    internalResourceId: String,
    targetName: String,
    targetType: String,
    logLevel: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnResourceSpecificLogging =
    software.amazon.awscdk.services.iot.CfnResourceSpecificLogging.Builder
      .create(stackCtx, internalResourceId)
      .targetName(targetName)
      .targetType(targetType)
      .logLevel(logLevel)
      .build()
}
