package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMemberProps {

  def apply(
    memberConfiguration: software.amazon.awscdk.services.managedblockchain.CfnMember.MemberConfigurationProperty,
    networkId: Option[String] = None,
    networkConfiguration: Option[software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkConfigurationProperty] = None,
    invitationId: Option[String] = None
  ): software.amazon.awscdk.services.managedblockchain.CfnMemberProps =
    (new software.amazon.awscdk.services.managedblockchain.CfnMemberProps.Builder)
      .memberConfiguration(memberConfiguration)
      .networkId(networkId.orNull)
      .networkConfiguration(networkConfiguration.orNull)
      .invitationId(invitationId.orNull)
      .build()
}
