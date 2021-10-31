package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IamInstanceProfileProperty {

  def apply(
    arn: Option[String] = None,
    name: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.IamInstanceProfileProperty =
    (new software.amazon.awscdk.services.ec2.CfnLaunchTemplate.IamInstanceProfileProperty.Builder)
      .arn(arn.orNull)
      .name(name.orNull)
      .build()
}
