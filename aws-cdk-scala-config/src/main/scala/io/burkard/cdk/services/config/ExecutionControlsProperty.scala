package io.burkard.cdk.services.config

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ExecutionControlsProperty {

  def apply(
    ssmControls: Option[software.amazon.awscdk.services.config.CfnRemediationConfiguration.SsmControlsProperty] = None
  ): software.amazon.awscdk.services.config.CfnRemediationConfiguration.ExecutionControlsProperty =
    (new software.amazon.awscdk.services.config.CfnRemediationConfiguration.ExecutionControlsProperty.Builder)
      .ssmControls(ssmControls.orNull)
      .build()
}
