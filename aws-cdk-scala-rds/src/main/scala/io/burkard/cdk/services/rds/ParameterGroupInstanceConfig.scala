package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ParameterGroupInstanceConfig {

  def apply(
    parameterGroupName: Option[String] = None
  ): software.amazon.awscdk.services.rds.ParameterGroupInstanceConfig =
    (new software.amazon.awscdk.services.rds.ParameterGroupInstanceConfig.Builder)
      .parameterGroupName(parameterGroupName.orNull)
      .build()
}
