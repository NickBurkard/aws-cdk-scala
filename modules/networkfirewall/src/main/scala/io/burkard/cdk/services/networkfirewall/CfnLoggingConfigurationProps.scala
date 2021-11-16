package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLoggingConfigurationProps {

  def apply(
    loggingConfiguration: software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LoggingConfigurationProperty,
    firewallArn: String,
    firewallName: Option[String] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnLoggingConfigurationProps =
    (new software.amazon.awscdk.services.networkfirewall.CfnLoggingConfigurationProps.Builder)
      .loggingConfiguration(loggingConfiguration)
      .firewallArn(firewallArn)
      .firewallName(firewallName.orNull)
      .build()
}
