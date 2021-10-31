package io.burkard.cdk.pipelines

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
