package io.burkard.cdk.services.config

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConformancePackInputParameterProperty {

  def apply(
    parameterValue: Option[String] = None,
    parameterName: Option[String] = None
  ): software.amazon.awscdk.services.config.CfnConformancePack.ConformancePackInputParameterProperty =
    (new software.amazon.awscdk.services.config.CfnConformancePack.ConformancePackInputParameterProperty.Builder)
      .parameterValue(parameterValue.orNull)
      .parameterName(parameterName.orNull)
      .build()
}
