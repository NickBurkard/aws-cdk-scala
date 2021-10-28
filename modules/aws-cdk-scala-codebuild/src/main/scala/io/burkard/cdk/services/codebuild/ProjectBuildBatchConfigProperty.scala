package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProjectBuildBatchConfigProperty {

  def apply(
    serviceRole: Option[String] = None,
    restrictions: Option[software.amazon.awscdk.services.codebuild.CfnProject.BatchRestrictionsProperty] = None,
    timeoutInMins: Option[Number] = None,
    combineArtifacts: Option[Boolean] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.ProjectBuildBatchConfigProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.ProjectBuildBatchConfigProperty.Builder)
      .serviceRole(serviceRole.orNull)
      .restrictions(restrictions.orNull)
      .timeoutInMins(timeoutInMins.orNull)
      .combineArtifacts(combineArtifacts.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
