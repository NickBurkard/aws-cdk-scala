package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LookoutMetricsDestinationPropertiesProperty {

  def apply(
    `object`: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.LookoutMetricsDestinationPropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.LookoutMetricsDestinationPropertiesProperty.Builder)
      .`object`(`object`.orNull)
      .build()
}
