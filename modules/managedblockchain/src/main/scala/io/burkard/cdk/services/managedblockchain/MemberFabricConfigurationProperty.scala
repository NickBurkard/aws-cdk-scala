package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MemberFabricConfigurationProperty {

  def apply(
    adminUsername: Option[String] = None,
    adminPassword: Option[String] = None
  ): software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFabricConfigurationProperty =
    (new software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFabricConfigurationProperty.Builder)
      .adminUsername(adminUsername.orNull)
      .adminPassword(adminPassword.orNull)
      .build()
}
