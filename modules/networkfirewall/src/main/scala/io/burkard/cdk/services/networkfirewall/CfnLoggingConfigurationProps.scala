package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLoggingConfigurationProps {

  def apply(
    loggingConfiguration: Option[software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LoggingConfigurationProperty] = None,
    firewallName: Option[String] = None,
    firewallArn: Option[String] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnLoggingConfigurationProps =
    (new software.amazon.awscdk.services.networkfirewall.CfnLoggingConfigurationProps.Builder)
      .loggingConfiguration(loggingConfiguration.orNull)
      .firewallName(firewallName.orNull)
      .firewallArn(firewallArn.orNull)
      .build()
}
