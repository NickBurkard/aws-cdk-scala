package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TagFilterProperty {

  def apply(
    key: Option[String] = None,
    `type`: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TagFilterProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TagFilterProperty.Builder)
      .key(key.orNull)
      .`type`(`type`.orNull)
      .value(value.orNull)
      .build()
}
