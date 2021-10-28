package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EcrSourceVariables {

  def apply(
    repositoryName: Option[String] = None,
    imageTag: Option[String] = None,
    registryId: Option[String] = None,
    imageDigest: Option[String] = None,
    imageUri: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.actions.EcrSourceVariables =
    (new software.amazon.awscdk.services.codepipeline.actions.EcrSourceVariables.Builder)
      .repositoryName(repositoryName.orNull)
      .imageTag(imageTag.orNull)
      .registryId(registryId.orNull)
      .imageDigest(imageDigest.orNull)
      .imageUri(imageUri.orNull)
      .build()
}
