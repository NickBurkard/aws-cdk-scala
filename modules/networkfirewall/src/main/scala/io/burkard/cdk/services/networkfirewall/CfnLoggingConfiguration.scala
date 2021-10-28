package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLoggingConfiguration {

  def apply(
    internalResourceId: String,
    loggingConfiguration: Option[software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LoggingConfigurationProperty] = None,
    firewallName: Option[String] = None,
    firewallArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration =
    software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.Builder
      .create(stackCtx, internalResourceId)
      .loggingConfiguration(loggingConfiguration.orNull)
      .firewallName(firewallName.orNull)
      .firewallArn(firewallArn.orNull)
      .build()
}
