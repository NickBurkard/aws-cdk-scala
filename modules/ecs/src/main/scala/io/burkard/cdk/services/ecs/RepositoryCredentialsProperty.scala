package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RepositoryCredentialsProperty {

  def apply(
    credentialsParameter: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty.Builder)
      .credentialsParameter(credentialsParameter.orNull)
      .build()
}
