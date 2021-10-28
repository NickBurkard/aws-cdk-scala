package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SecurityGroupProps {

  def apply(
    disableInlineRules: Option[Boolean] = None,
    description: Option[String] = None,
    securityGroupName: Option[String] = None,
    allowAllOutbound: Option[Boolean] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None
  ): software.amazon.awscdk.services.ec2.SecurityGroupProps =
    (new software.amazon.awscdk.services.ec2.SecurityGroupProps.Builder)
      .disableInlineRules(disableInlineRules.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .description(description.orNull)
      .securityGroupName(securityGroupName.orNull)
      .allowAllOutbound(allowAllOutbound.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpc(vpc.orNull)
      .build()
}
