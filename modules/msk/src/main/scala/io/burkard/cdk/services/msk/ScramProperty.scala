package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScramProperty {

  def apply(
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.ScramProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.ScramProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
