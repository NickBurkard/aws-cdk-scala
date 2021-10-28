package io.burkard.cdk.services.elasticsearch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ZoneAwarenessConfig {

  def apply(
    availabilityZoneCount: Option[Number] = None,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig =
    (new software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig.Builder)
      .availabilityZoneCount(availabilityZoneCount.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
