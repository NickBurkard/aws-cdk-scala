package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ELBInfoProperty {

  def apply(
    name: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ELBInfoProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ELBInfoProperty.Builder)
      .name(name.orNull)
      .build()
}
