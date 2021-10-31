package io.burkard.cdk.pipelines

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
