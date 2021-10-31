package io.burkard.cdk.services.ecr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RepositoryAttributes {

  def apply(
    repositoryName: Option[String] = None,
    repositoryArn: Option[String] = None
  ): software.amazon.awscdk.services.ecr.RepositoryAttributes =
    (new software.amazon.awscdk.services.ecr.RepositoryAttributes.Builder)
      .repositoryName(repositoryName.orNull)
      .repositoryArn(repositoryArn.orNull)
      .build()
}
