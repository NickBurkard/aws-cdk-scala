package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecurityGroupProps {

  def apply(
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    disableInlineRules: Option[Boolean] = None,
    description: Option[String] = None,
    securityGroupName: Option[String] = None,
    allowAllOutbound: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.SecurityGroupProps =
    (new software.amazon.awscdk.services.ec2.SecurityGroupProps.Builder)
      .vpc(vpc)
      .disableInlineRules(disableInlineRules.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .description(description.orNull)
      .securityGroupName(securityGroupName.orNull)
      .allowAllOutbound(allowAllOutbound.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
