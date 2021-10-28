package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DockerImageDestination {

  def apply(
    repositoryName: Option[String] = None,
    assumeRoleArn: Option[String] = None,
    imageTag: Option[String] = None,
    assumeRoleExternalId: Option[String] = None,
    region: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.DockerImageDestination =
    (new software.amazon.awscdk.cloudassembly.schema.DockerImageDestination.Builder)
      .repositoryName(repositoryName.orNull)
      .assumeRoleArn(assumeRoleArn.orNull)
      .imageTag(imageTag.orNull)
      .assumeRoleExternalId(assumeRoleExternalId.orNull)
      .region(region.orNull)
      .build()
}
