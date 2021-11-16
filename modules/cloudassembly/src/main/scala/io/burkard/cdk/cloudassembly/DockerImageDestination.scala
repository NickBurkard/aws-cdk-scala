package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DockerImageDestination {

  def apply(
    repositoryName: String,
    imageTag: String,
    assumeRoleArn: Option[String] = None,
    assumeRoleExternalId: Option[String] = None,
    region: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.DockerImageDestination =
    (new software.amazon.awscdk.cloudassembly.schema.DockerImageDestination.Builder)
      .repositoryName(repositoryName)
      .imageTag(imageTag)
      .assumeRoleArn(assumeRoleArn.orNull)
      .assumeRoleExternalId(assumeRoleExternalId.orNull)
      .region(region.orNull)
      .build()
}
