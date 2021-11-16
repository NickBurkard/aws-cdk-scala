package io.burkard.cdk.services.cloud9

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RepositoryProperty {

  def apply(
    pathComponent: String,
    repositoryUrl: String
  ): software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty =
    (new software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty.Builder)
      .pathComponent(pathComponent)
      .repositoryUrl(repositoryUrl)
      .build()
}
