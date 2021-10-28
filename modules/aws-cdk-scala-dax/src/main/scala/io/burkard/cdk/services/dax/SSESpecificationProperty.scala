package io.burkard.cdk.services.dax

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SSESpecificationProperty {

  def apply(
    sseEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.dax.CfnCluster.SSESpecificationProperty =
    (new software.amazon.awscdk.services.dax.CfnCluster.SSESpecificationProperty.Builder)
      .sseEnabled(sseEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
