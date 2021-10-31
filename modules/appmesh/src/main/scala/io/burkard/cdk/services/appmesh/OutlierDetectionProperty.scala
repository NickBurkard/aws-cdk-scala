package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OutlierDetectionProperty {

  def apply(
    maxEjectionPercent: Option[Number] = None,
    baseEjectionDuration: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty] = None,
    interval: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty] = None,
    maxServerErrors: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.OutlierDetectionProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.OutlierDetectionProperty.Builder)
      .maxEjectionPercent(maxEjectionPercent.orNull)
      .baseEjectionDuration(baseEjectionDuration.orNull)
      .interval(interval.orNull)
      .maxServerErrors(maxServerErrors.orNull)
      .build()
}
