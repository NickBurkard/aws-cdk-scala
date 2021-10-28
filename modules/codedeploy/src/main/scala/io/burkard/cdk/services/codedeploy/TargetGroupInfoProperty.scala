package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TargetGroupInfoProperty {

  def apply(
    name: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupInfoProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupInfoProperty.Builder)
      .name(name.orNull)
      .build()
}
