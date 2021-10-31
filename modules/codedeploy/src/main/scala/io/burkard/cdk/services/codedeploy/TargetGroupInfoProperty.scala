package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TargetGroupInfoProperty {

  def apply(
    name: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupInfoProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.TargetGroupInfoProperty.Builder)
      .name(name.orNull)
      .build()
}
