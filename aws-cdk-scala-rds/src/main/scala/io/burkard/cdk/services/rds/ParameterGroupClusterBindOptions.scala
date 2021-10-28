package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ParameterGroupClusterBindOptions {

  def apply: software.amazon.awscdk.services.rds.ParameterGroupClusterBindOptions =
    (new software.amazon.awscdk.services.rds.ParameterGroupClusterBindOptions.Builder)
      
      .build()
}
