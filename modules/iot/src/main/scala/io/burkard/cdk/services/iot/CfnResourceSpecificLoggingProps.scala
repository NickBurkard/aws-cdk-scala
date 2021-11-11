package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceSpecificLoggingProps {

  def apply(
    targetName: Option[String] = None,
    targetType: Option[String] = None,
    logLevel: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps =
    (new software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps.Builder)
      .targetName(targetName.orNull)
      .targetType(targetType.orNull)
      .logLevel(logLevel.orNull)
      .build()
}
