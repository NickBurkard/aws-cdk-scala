package io.burkard.cdk.services.backup

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
