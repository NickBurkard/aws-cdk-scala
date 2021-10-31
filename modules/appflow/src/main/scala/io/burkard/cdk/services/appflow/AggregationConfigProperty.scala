package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AggregationConfigProperty {

  def apply(
    aggregationType: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.AggregationConfigProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.AggregationConfigProperty.Builder)
      .aggregationType(aggregationType.orNull)
      .build()
}
