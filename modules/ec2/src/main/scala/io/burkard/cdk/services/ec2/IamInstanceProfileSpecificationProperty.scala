package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IamInstanceProfileSpecificationProperty {

  def apply(
    arn: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.IamInstanceProfileSpecificationProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.IamInstanceProfileSpecificationProperty.Builder)
      .arn(arn.orNull)
      .build()
}
