package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkConfigurationProperty {

  def apply(
    name: String,
    framework: String,
    votingPolicy: software.amazon.awscdk.services.managedblockchain.CfnMember.VotingPolicyProperty,
    frameworkVersion: String,
    description: Option[String] = None,
    networkFrameworkConfiguration: Option[software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkFrameworkConfigurationProperty] = None
  ): software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkConfigurationProperty =
    (new software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkConfigurationProperty.Builder)
      .name(name)
      .framework(framework)
      .votingPolicy(votingPolicy)
      .frameworkVersion(frameworkVersion)
      .description(description.orNull)
      .networkFrameworkConfiguration(networkFrameworkConfiguration.orNull)
      .build()
}
