package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ParameterGroupInstanceBindOptions {

  def apply: software.amazon.awscdk.services.rds.ParameterGroupInstanceBindOptions =
    (new software.amazon.awscdk.services.rds.ParameterGroupInstanceBindOptions.Builder)
      
      .build()
}
