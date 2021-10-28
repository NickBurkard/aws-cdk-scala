package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ParameterGroupClusterConfig {

  def apply(
    parameterGroupName: Option[String] = None
  ): software.amazon.awscdk.services.rds.ParameterGroupClusterConfig =
    (new software.amazon.awscdk.services.rds.ParameterGroupClusterConfig.Builder)
      .parameterGroupName(parameterGroupName.orNull)
      .build()
}
