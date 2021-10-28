package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TargetGroupProperty {

  def apply(
    arn: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupProperty.Builder)
      .arn(arn.orNull)
      .build()
}
