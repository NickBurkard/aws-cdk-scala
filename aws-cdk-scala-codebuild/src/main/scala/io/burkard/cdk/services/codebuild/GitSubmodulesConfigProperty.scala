package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GitSubmodulesConfigProperty {

  def apply(
    fetchSubmodules: Option[Boolean] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty.Builder)
      .fetchSubmodules(fetchSubmodules.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
