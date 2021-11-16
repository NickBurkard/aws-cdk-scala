package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OutlierDetection {

  def apply(
    maxEjectionPercent: Number,
    baseEjectionDuration: software.amazon.awscdk.Duration,
    interval: software.amazon.awscdk.Duration,
    maxServerErrors: Number
  ): software.amazon.awscdk.services.appmesh.OutlierDetection =
    (new software.amazon.awscdk.services.appmesh.OutlierDetection.Builder)
      .maxEjectionPercent(maxEjectionPercent)
      .baseEjectionDuration(baseEjectionDuration)
      .interval(interval)
      .maxServerErrors(maxServerErrors)
      .build()
}
