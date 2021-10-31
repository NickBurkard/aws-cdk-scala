package io.burkard.cdk.services.config

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ExecutionControlsProperty {

  def apply(
    ssmControls: Option[software.amazon.awscdk.services.config.CfnRemediationConfiguration.SsmControlsProperty] = None
  ): software.amazon.awscdk.services.config.CfnRemediationConfiguration.ExecutionControlsProperty =
    (new software.amazon.awscdk.services.config.CfnRemediationConfiguration.ExecutionControlsProperty.Builder)
      .ssmControls(ssmControls.orNull)
      .build()
}
