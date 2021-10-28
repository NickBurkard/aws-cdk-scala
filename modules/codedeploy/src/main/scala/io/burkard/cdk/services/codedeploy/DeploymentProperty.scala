package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeploymentProperty {

  def apply(
    description: Option[String] = None,
    revision: Option[software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.RevisionLocationProperty] = None,
    ignoreApplicationStopFailures: Option[Boolean] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.DeploymentProperty.Builder)
      .description(description.orNull)
      .revision(revision.orNull)
      .ignoreApplicationStopFailures(ignoreApplicationStopFailures.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
