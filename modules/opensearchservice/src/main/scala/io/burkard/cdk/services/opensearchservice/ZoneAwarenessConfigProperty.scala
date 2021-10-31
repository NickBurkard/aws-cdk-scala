package io.burkard.cdk.services.opensearchservice

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ZoneAwarenessConfigProperty {

  def apply(
    availabilityZoneCount: Option[Number] = None
  ): software.amazon.awscdk.services.opensearchservice.CfnDomain.ZoneAwarenessConfigProperty =
    (new software.amazon.awscdk.services.opensearchservice.CfnDomain.ZoneAwarenessConfigProperty.Builder)
      .availabilityZoneCount(availabilityZoneCount.orNull)
      .build()
}
