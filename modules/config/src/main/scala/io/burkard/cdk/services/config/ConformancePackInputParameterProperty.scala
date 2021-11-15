package io.burkard.cdk.services.config

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConformancePackInputParameterProperty {

  def apply(
    parameterValue: Option[String] = None,
    parameterName: Option[String] = None
  ): software.amazon.awscdk.services.config.CfnOrganizationConformancePack.ConformancePackInputParameterProperty =
    (new software.amazon.awscdk.services.config.CfnOrganizationConformancePack.ConformancePackInputParameterProperty.Builder)
      .parameterValue(parameterValue.orNull)
      .parameterName(parameterName.orNull)
      .build()
}
