package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RepositoryImage {

  def apply(
    imageName: String,
    credentials: Option[software.amazon.awscdk.services.secretsmanager.ISecret] = None
  ): software.amazon.awscdk.services.ecs.RepositoryImage =
    software.amazon.awscdk.services.ecs.RepositoryImage.Builder
      .create(imageName)
      .credentials(credentials.orNull)
      .build()
}
