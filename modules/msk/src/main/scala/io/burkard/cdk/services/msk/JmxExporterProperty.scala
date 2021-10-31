package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JmxExporterProperty {

  def apply(
    enabledInBroker: Option[Boolean] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.JmxExporterProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.JmxExporterProperty.Builder)
      .enabledInBroker(enabledInBroker.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
