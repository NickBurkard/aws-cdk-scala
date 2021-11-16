package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TargetGroupProperty {

  def apply(
    arn: String
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupProperty.Builder)
      .arn(arn)
      .build()
}
