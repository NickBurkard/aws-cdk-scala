package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ClusterEngineConfig {

  def apply(
    features: Option[software.amazon.awscdk.services.rds.ClusterEngineFeatures] = None,
    parameterGroup: Option[software.amazon.awscdk.services.rds.IParameterGroup] = None,
    port: Option[Number] = None
  ): software.amazon.awscdk.services.rds.ClusterEngineConfig =
    (new software.amazon.awscdk.services.rds.ClusterEngineConfig.Builder)
      .features(features.orNull)
      .parameterGroup(parameterGroup.orNull)
      .port(port.orNull)
      .build()
}
