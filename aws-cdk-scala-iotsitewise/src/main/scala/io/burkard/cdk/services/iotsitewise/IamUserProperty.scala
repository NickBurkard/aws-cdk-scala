package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IamUserProperty {

  def apply(
    arn: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamUserProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamUserProperty.Builder)
      .arn(arn.orNull)
      .build()
}
