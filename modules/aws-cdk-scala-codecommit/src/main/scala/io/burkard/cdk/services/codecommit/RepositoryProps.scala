package io.burkard.cdk.services.codecommit

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RepositoryProps {

  def apply(
    repositoryName: Option[String] = None,
    description: Option[String] = None
  ): software.amazon.awscdk.services.codecommit.RepositoryProps =
    (new software.amazon.awscdk.services.codecommit.RepositoryProps.Builder)
      .repositoryName(repositoryName.orNull)
      .description(description.orNull)
      .build()
}
