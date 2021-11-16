package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClientVpnAuthorizationRuleOptions {

  def apply(
    cidr: String,
    description: Option[String] = None,
    groupId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleOptions =
    (new software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleOptions.Builder)
      .cidr(cidr)
      .description(description.orNull)
      .groupId(groupId.orNull)
      .build()
}
