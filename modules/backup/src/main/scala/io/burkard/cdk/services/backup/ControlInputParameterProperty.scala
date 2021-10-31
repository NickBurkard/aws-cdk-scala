package io.burkard.cdk.services.backup

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ControlInputParameterProperty {

  def apply(
    parameterValue: Option[String] = None,
    parameterName: Option[String] = None
  ): software.amazon.awscdk.services.backup.CfnFramework.ControlInputParameterProperty =
    (new software.amazon.awscdk.services.backup.CfnFramework.ControlInputParameterProperty.Builder)
      .parameterValue(parameterValue.orNull)
      .parameterName(parameterName.orNull)
      .build()
}
