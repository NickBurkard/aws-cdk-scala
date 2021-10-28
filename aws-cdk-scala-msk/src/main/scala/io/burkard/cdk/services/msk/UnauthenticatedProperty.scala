package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UnauthenticatedProperty {

  def apply(
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.UnauthenticatedProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.UnauthenticatedProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
