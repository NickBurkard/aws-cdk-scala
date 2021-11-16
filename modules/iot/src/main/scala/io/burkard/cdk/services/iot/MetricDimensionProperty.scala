package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricDimensionProperty {

  def apply(
    dimensionName: String,
    operator: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricDimensionProperty =
    (new software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricDimensionProperty.Builder)
      .dimensionName(dimensionName)
      .operator(operator.orNull)
      .build()
}
