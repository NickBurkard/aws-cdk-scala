package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecurityGroup {

  def apply(
    internalResourceId: String,
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    disableInlineRules: Option[Boolean] = None,
    description: Option[String] = None,
    securityGroupName: Option[String] = None,
    allowAllOutbound: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.SecurityGroup =
    software.amazon.awscdk.services.ec2.SecurityGroup.Builder
      .create(stackCtx, internalResourceId)
      .vpc(vpc)
      .disableInlineRules(disableInlineRules.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .description(description.orNull)
      .securityGroupName(securityGroupName.orNull)
      .allowAllOutbound(allowAllOutbound.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
