package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MetricDimensionProperty {

  def apply(
    dimensionName: Option[String] = None,
    operator: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricDimensionProperty =
    (new software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricDimensionProperty.Builder)
      .dimensionName(dimensionName.orNull)
      .operator(operator.orNull)
      .build()
}
