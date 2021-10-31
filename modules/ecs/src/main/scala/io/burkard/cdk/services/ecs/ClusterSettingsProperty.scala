package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClusterSettingsProperty {

  def apply(
    name: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnCluster.ClusterSettingsProperty =
    (new software.amazon.awscdk.services.ecs.CfnCluster.ClusterSettingsProperty.Builder)
      .name(name.orNull)
      .value(value.orNull)
      .build()
}
