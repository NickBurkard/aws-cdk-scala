package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ParameterGroupInstanceBindOptions {

  def apply: software.amazon.awscdk.services.rds.ParameterGroupInstanceBindOptions =
    (new software.amazon.awscdk.services.rds.ParameterGroupInstanceBindOptions.Builder)
      
      .build()
}
