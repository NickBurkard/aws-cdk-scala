package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OutlierDetectionProperty {

  def apply(
    maxEjectionPercent: Number,
    baseEjectionDuration: software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty,
    interval: software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty,
    maxServerErrors: Number
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.OutlierDetectionProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.OutlierDetectionProperty.Builder)
      .maxEjectionPercent(maxEjectionPercent)
      .baseEjectionDuration(baseEjectionDuration)
      .interval(interval)
      .maxServerErrors(maxServerErrors)
      .build()
}
