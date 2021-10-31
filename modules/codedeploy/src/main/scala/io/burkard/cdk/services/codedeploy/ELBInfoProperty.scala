package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ELBInfoProperty {

  def apply(
    name: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ELBInfoProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.ELBInfoProperty.Builder)
      .name(name.orNull)
      .build()
}
