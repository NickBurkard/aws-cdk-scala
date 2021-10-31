package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RepositoryImageProps {

  def apply(
    credentials: Option[software.amazon.awscdk.services.secretsmanager.ISecret] = None
  ): software.amazon.awscdk.services.ecs.RepositoryImageProps =
    (new software.amazon.awscdk.services.ecs.RepositoryImageProps.Builder)
      .credentials(credentials.orNull)
      .build()
}
