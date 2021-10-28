package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EC2TagFilterProperty {

  def apply(
    key: Option[String] = None,
    `type`: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagFilterProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.EC2TagFilterProperty.Builder)
      .key(key.orNull)
      .`type`(`type`.orNull)
      .value(value.orNull)
      .build()
}
