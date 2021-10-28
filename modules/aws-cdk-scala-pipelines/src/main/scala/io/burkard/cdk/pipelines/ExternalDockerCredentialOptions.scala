package io.burkard.cdk.pipelines

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ExternalDockerCredentialOptions {

  def apply(
    assumeRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    secretUsernameField: Option[String] = None,
    usages: Option[List[_ <: software.amazon.awscdk.pipelines.DockerCredentialUsage]] = None,
    secretPasswordField: Option[String] = None
  ): software.amazon.awscdk.pipelines.ExternalDockerCredentialOptions =
    (new software.amazon.awscdk.pipelines.ExternalDockerCredentialOptions.Builder)
      .assumeRole(assumeRole.orNull)
      .secretUsernameField(secretUsernameField.orNull)
      .usages(usages.map(_.asJava).orNull)
      .secretPasswordField(secretPasswordField.orNull)
      .build()
}
