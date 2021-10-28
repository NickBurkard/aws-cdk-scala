package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BatchBuildConfig {

  def apply(
    role: Option[software.amazon.awscdk.services.iam.IRole] = None
  ): software.amazon.awscdk.services.codebuild.BatchBuildConfig =
    (new software.amazon.awscdk.services.codebuild.BatchBuildConfig.Builder)
      .role(role.orNull)
      .build()
}
