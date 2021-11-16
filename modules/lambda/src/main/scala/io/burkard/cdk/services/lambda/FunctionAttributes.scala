package io.burkard.cdk.services.lambda

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FunctionAttributes {

  def apply(
    functionArn: String,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None,
    sameEnvironment: Option[Boolean] = None,
    securityGroupId: Option[String] = None
  ): software.amazon.awscdk.services.lambda.FunctionAttributes =
    (new software.amazon.awscdk.services.lambda.FunctionAttributes.Builder)
      .functionArn(functionArn)
      .role(role.orNull)
      .securityGroup(securityGroup.orNull)
      .sameEnvironment(sameEnvironment.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .securityGroupId(securityGroupId.orNull)
      .build()
}
