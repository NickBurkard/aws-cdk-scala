package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMemberProps {

  def apply(
    networkId: Option[String] = None,
    networkConfiguration: Option[software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkConfigurationProperty] = None,
    memberConfiguration: Option[software.amazon.awscdk.services.managedblockchain.CfnMember.MemberConfigurationProperty] = None,
    invitationId: Option[String] = None
  ): software.amazon.awscdk.services.managedblockchain.CfnMemberProps =
    (new software.amazon.awscdk.services.managedblockchain.CfnMemberProps.Builder)
      .networkId(networkId.orNull)
      .networkConfiguration(networkConfiguration.orNull)
      .memberConfiguration(memberConfiguration.orNull)
      .invitationId(invitationId.orNull)
      .build()
}
