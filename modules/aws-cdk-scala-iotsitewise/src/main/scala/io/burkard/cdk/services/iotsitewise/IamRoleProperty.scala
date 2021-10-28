package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IamRoleProperty {

  def apply(
    arn: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamRoleProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamRoleProperty.Builder)
      .arn(arn.orNull)
      .build()
}
