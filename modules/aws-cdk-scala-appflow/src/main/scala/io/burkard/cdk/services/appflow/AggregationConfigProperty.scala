package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AggregationConfigProperty {

  def apply(
    aggregationType: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.AggregationConfigProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.AggregationConfigProperty.Builder)
      .aggregationType(aggregationType.orNull)
      .build()
}
