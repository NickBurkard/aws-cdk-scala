package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OutlierDetection {

  def apply(
    maxEjectionPercent: Option[Number] = None,
    baseEjectionDuration: Option[software.amazon.awscdk.Duration] = None,
    interval: Option[software.amazon.awscdk.Duration] = None,
    maxServerErrors: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.OutlierDetection =
    (new software.amazon.awscdk.services.appmesh.OutlierDetection.Builder)
      .maxEjectionPercent(maxEjectionPercent.orNull)
      .baseEjectionDuration(baseEjectionDuration.orNull)
      .interval(interval.orNull)
      .maxServerErrors(maxServerErrors.orNull)
      .build()
}
