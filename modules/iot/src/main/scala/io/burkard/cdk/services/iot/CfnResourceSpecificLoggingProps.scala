package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceSpecificLoggingProps {

  def apply(
    targetName: String,
    targetType: String,
    logLevel: String
  ): software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps =
    (new software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps.Builder)
      .targetName(targetName)
      .targetType(targetType)
      .logLevel(logLevel)
      .build()
}
