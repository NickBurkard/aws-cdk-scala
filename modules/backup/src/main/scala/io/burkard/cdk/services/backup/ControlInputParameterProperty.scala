package io.burkard.cdk.services.backup

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ControlInputParameterProperty {

  def apply(
    parameterValue: String,
    parameterName: String
  ): software.amazon.awscdk.services.backup.CfnFramework.ControlInputParameterProperty =
    (new software.amazon.awscdk.services.backup.CfnFramework.ControlInputParameterProperty.Builder)
      .parameterValue(parameterValue)
      .parameterName(parameterName)
      .build()
}
