package io.burkard.cdk.services.ecr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RepositoryAttributes {

  def apply(
    repositoryName: String,
    repositoryArn: String
  ): software.amazon.awscdk.services.ecr.RepositoryAttributes =
    (new software.amazon.awscdk.services.ecr.RepositoryAttributes.Builder)
      .repositoryName(repositoryName)
      .repositoryArn(repositoryArn)
      .build()
}
