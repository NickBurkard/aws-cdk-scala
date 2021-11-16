package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EcrSourceVariables {

  def apply(
    repositoryName: String,
    imageTag: String,
    registryId: String,
    imageDigest: String,
    imageUri: String
  ): software.amazon.awscdk.services.codepipeline.actions.EcrSourceVariables =
    (new software.amazon.awscdk.services.codepipeline.actions.EcrSourceVariables.Builder)
      .repositoryName(repositoryName)
      .imageTag(imageTag)
      .registryId(registryId)
      .imageDigest(imageDigest)
      .imageUri(imageUri)
      .build()
}
