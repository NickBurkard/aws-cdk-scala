package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RevisionLocationProperty {

  def apply(
    s3Location: Option[software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.S3LocationProperty] = None,
    revisionType: Option[String] = None,
    gitHubLocation: Option[software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.GitHubLocationProperty] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.RevisionLocationProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.RevisionLocationProperty.Builder)
      .s3Location(s3Location.orNull)
      .revisionType(revisionType.orNull)
      .gitHubLocation(gitHubLocation.orNull)
      .build()
}
