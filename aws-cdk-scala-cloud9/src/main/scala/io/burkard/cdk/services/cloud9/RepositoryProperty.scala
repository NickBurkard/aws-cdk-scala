package io.burkard.cdk.services.cloud9

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RepositoryProperty {

  def apply(
    pathComponent: Option[String] = None,
    repositoryUrl: Option[String] = None
  ): software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty =
    (new software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty.Builder)
      .pathComponent(pathComponent.orNull)
      .repositoryUrl(repositoryUrl.orNull)
      .build()
}
