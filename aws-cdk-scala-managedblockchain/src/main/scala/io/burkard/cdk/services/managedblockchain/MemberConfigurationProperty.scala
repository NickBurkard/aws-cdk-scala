package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MemberConfigurationProperty {

  def apply(
    name: Option[String] = None,
    description: Option[String] = None,
    memberFrameworkConfiguration: Option[software.amazon.awscdk.services.managedblockchain.CfnMember.MemberFrameworkConfigurationProperty] = None
  ): software.amazon.awscdk.services.managedblockchain.CfnMember.MemberConfigurationProperty =
    (new software.amazon.awscdk.services.managedblockchain.CfnMember.MemberConfigurationProperty.Builder)
      .name(name.orNull)
      .description(description.orNull)
      .memberFrameworkConfiguration(memberFrameworkConfiguration.orNull)
      .build()
}
