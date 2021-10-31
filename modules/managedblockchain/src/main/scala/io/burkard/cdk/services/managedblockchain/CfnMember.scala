package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMember {

  def apply(
    internalResourceId: String,
    networkId: Option[String] = None,
    networkConfiguration: Option[software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkConfigurationProperty] = None,
    memberConfiguration: Option[software.amazon.awscdk.services.managedblockchain.CfnMember.MemberConfigurationProperty] = None,
    invitationId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.managedblockchain.CfnMember =
    software.amazon.awscdk.services.managedblockchain.CfnMember.Builder
      .create(stackCtx, internalResourceId)
      .networkId(networkId.orNull)
      .networkConfiguration(networkConfiguration.orNull)
      .memberConfiguration(memberConfiguration.orNull)
      .invitationId(invitationId.orNull)
      .build()
}
