package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IamProperty {

  def apply(
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.IamProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.IamProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
