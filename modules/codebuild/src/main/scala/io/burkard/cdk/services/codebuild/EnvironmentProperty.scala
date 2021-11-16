package io.burkard.cdk.services.codebuild

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EnvironmentProperty {

  def apply(
    image: String,
    computeType: String,
    `type`: String,
    privilegedMode: Option[Boolean] = None,
    certificate: Option[String] = None,
    imagePullCredentialsType: Option[String] = None,
    environmentVariables: Option[List[_]] = None,
    registryCredential: Option[software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.Builder)
      .image(image)
      .computeType(computeType)
      .`type`(`type`)
      .privilegedMode(privilegedMode.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .certificate(certificate.orNull)
      .imagePullCredentialsType(imagePullCredentialsType.orNull)
      .environmentVariables(environmentVariables.map(_.asJava).orNull)
      .registryCredential(registryCredential.orNull)
      .build()
}
