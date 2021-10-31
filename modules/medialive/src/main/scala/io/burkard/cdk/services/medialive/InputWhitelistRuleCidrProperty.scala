package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InputWhitelistRuleCidrProperty {

  def apply(
    cidr: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnInputSecurityGroup.InputWhitelistRuleCidrProperty =
    (new software.amazon.awscdk.services.medialive.CfnInputSecurityGroup.InputWhitelistRuleCidrProperty.Builder)
      .cidr(cidr.orNull)
      .build()
}
