package io.burkard.cdk.services.elasticsearch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ZoneAwarenessConfigProperty {

  def apply(
    availabilityZoneCount: Option[Number] = None
  ): software.amazon.awscdk.services.elasticsearch.CfnDomain.ZoneAwarenessConfigProperty =
    (new software.amazon.awscdk.services.elasticsearch.CfnDomain.ZoneAwarenessConfigProperty.Builder)
      .availabilityZoneCount(availabilityZoneCount.orNull)
      .build()
}
