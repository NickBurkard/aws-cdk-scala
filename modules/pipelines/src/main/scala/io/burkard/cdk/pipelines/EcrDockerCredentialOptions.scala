package io.burkard.cdk.pipelines

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EcrDockerCredentialOptions {

  def apply(
    assumeRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    usages: Option[List[_ <: software.amazon.awscdk.pipelines.DockerCredentialUsage]] = None
  ): software.amazon.awscdk.pipelines.EcrDockerCredentialOptions =
    (new software.amazon.awscdk.pipelines.EcrDockerCredentialOptions.Builder)
      .assumeRole(assumeRole.orNull)
      .usages(usages.map(_.asJava).orNull)
      .build()
}