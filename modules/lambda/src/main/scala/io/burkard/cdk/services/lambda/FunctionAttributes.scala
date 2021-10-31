package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FunctionAttributes {

  def apply(
    sameEnvironment: Option[Boolean] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    functionArn: Option[String] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None
  ): software.amazon.awscdk.services.lambda.FunctionAttributes =
    (new software.amazon.awscdk.services.lambda.FunctionAttributes.Builder)
      .sameEnvironment(sameEnvironment.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .role(role.orNull)
      .functionArn(functionArn.orNull)
      .securityGroup(securityGroup.orNull)
      .build()
}
