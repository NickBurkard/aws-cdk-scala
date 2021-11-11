package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceSpecificLogging {

  def apply(
    internalResourceId: String,
    targetName: Option[String] = None,
    targetType: Option[String] = None,
    logLevel: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnResourceSpecificLogging =
    software.amazon.awscdk.services.iot.CfnResourceSpecificLogging.Builder
      .create(stackCtx, internalResourceId)
      .targetName(targetName.orNull)
      .targetType(targetType.orNull)
      .logLevel(logLevel.orNull)
      .build()
}
