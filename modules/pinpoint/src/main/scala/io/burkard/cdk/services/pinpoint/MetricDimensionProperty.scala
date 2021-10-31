package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricDimensionProperty {

  def apply(
    comparisonOperator: Option[String] = None,
    value: Option[Number] = None
  ): software.amazon.awscdk.services.pinpoint.CfnCampaign.MetricDimensionProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnCampaign.MetricDimensionProperty.Builder)
      .comparisonOperator(comparisonOperator.orNull)
      .value(value.orNull)
      .build()
}
