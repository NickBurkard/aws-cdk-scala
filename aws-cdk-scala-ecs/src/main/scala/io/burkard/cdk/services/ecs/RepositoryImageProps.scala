package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RepositoryImageProps {

  def apply(
    credentials: Option[software.amazon.awscdk.services.secretsmanager.ISecret] = None
  ): software.amazon.awscdk.services.ecs.RepositoryImageProps =
    (new software.amazon.awscdk.services.ecs.RepositoryImageProps.Builder)
      .credentials(credentials.orNull)
      .build()
}
