package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeploymentProperty {

  def apply(
    revision: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.RevisionLocationProperty,
    description: Option[String] = None,
    ignoreApplicationStopFailures: Option[Boolean] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentProperty.Builder)
      .revision(revision)
      .description(description.orNull)
      .ignoreApplicationStopFailures(ignoreApplicationStopFailures.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
