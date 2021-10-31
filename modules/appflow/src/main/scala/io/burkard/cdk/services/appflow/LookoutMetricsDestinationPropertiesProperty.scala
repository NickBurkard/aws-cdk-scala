package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LookoutMetricsDestinationPropertiesProperty {

  def apply(
    `object`: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.LookoutMetricsDestinationPropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.LookoutMetricsDestinationPropertiesProperty.Builder)
      .`object`(`object`.orNull)
      .build()
}
