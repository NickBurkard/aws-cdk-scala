package io.burkard.cdk.services.codecommit

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RepositoryProps {

  def apply(
    repositoryName: String,
    description: Option[String] = None
  ): software.amazon.awscdk.services.codecommit.RepositoryProps =
    (new software.amazon.awscdk.services.codecommit.RepositoryProps.Builder)
      .repositoryName(repositoryName)
      .description(description.orNull)
      .build()
}
