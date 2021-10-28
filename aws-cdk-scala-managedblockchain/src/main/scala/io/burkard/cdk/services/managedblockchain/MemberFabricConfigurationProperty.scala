package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
