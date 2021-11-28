package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FunctionAttributes {

  def apply(
    functionArn: String,
    sameEnvironment: Option[Boolean] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None
  ): software.amazon.awscdk.services.lambda.FunctionAttributes =
    (new software.amazon.awscdk.services.lambda.FunctionAttributes.Builder)
      .functionArn(functionArn)
      .sameEnvironment(sameEnvironment.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .role(role.orNull)
      .securityGroup(securityGroup.orNull)
      .build()
}
