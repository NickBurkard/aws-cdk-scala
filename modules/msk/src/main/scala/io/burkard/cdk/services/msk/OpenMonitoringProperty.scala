package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OpenMonitoringProperty {

  def apply(
    prometheus: software.amazon.awscdk.services.msk.CfnCluster.PrometheusProperty
  ): software.amazon.awscdk.services.msk.CfnCluster.OpenMonitoringProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.OpenMonitoringProperty.Builder)
      .prometheus(prometheus)
      .build()
}
