package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NodeExporterProperty {

  def apply(
    enabledInBroker: Option[Boolean] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.NodeExporterProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.NodeExporterProperty.Builder)
      .enabledInBroker(enabledInBroker.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}