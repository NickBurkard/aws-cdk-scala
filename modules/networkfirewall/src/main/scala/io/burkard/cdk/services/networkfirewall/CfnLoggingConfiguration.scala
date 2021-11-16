package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLoggingConfiguration {

  def apply(
    internalResourceId: String,
    loggingConfiguration: software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LoggingConfigurationProperty,
    firewallArn: String,
    firewallName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration =
    software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.Builder
      .create(stackCtx, internalResourceId)
      .loggingConfiguration(loggingConfiguration)
      .firewallArn(firewallArn)
      .firewallName(firewallName.orNull)
      .build()
}
