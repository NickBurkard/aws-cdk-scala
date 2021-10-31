package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ParameterGroupClusterBindOptions {

  def apply: software.amazon.awscdk.services.rds.ParameterGroupClusterBindOptions =
    (new software.amazon.awscdk.services.rds.ParameterGroupClusterBindOptions.Builder)
      
      .build()
}
