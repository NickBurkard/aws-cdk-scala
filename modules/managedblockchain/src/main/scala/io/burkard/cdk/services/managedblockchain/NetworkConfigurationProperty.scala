package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkConfigurationProperty {

  def apply(
    name: Option[String] = None,
    description: Option[String] = None,
    framework: Option[String] = None,
    votingPolicy: Option[software.amazon.awscdk.services.managedblockchain.CfnMember.VotingPolicyProperty] = None,
    networkFrameworkConfiguration: Option[software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFrameworkConfigurationProperty] = None,
    frameworkVersion: Option[String] = None
  ): software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkConfigurationProperty =
    (new software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkConfigurationProperty.Builder)
      .name(name.orNull)
      .description(description.orNull)
      .framework(framework.orNull)
      .votingPolicy(votingPolicy.orNull)
      .networkFrameworkConfiguration(networkFrameworkConfiguration.orNull)
      .frameworkVersion(frameworkVersion.orNull)
      .build()
}
