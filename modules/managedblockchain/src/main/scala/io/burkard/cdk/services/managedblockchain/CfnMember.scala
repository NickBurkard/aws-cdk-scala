package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMember {

  def apply(
    internalResourceId: String,
    memberConfiguration: software.amazon.awscdk.services.managedblockchain.CfnMember.MemberConfigurationProperty,
    networkId: Option[String] = None,
    networkConfiguration: Option[software.amazon.awscdk.services.managedblockchain.CfnMember.NetworkConfigurationProperty] = None,
    invitationId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.managedblockchain.CfnMember =
    software.amazon.awscdk.services.managedblockchain.CfnMember.Builder
      .create(stackCtx, internalResourceId)
      .memberConfiguration(memberConfiguration)
      .networkId(networkId.orNull)
      .networkConfiguration(networkConfiguration.orNull)
      .invitationId(invitationId.orNull)
      .build()
}
