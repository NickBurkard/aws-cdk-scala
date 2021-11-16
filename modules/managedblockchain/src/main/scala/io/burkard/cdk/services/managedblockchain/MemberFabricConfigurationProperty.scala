package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MemberFabricConfigurationProperty {

  def apply(
    adminUsername: String,
    adminPassword: String
  ): software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFabricConfigurationProperty =
    (new software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFabricConfigurationProperty.Builder)
      .adminUsername(adminUsername)
      .adminPassword(adminPassword)
      .build()
}
