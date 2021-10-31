package io.burkard.cdk.services.codebuild

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EnvironmentProperty {

  def apply(
    privilegedMode: Option[Boolean] = None,
    certificate: Option[String] = None,
    image: Option[String] = None,
    imagePullCredentialsType: Option[String] = None,
    environmentVariables: Option[List[_]] = None,
    computeType: Option[String] = None,
    registryCredential: Option[software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.Builder)
      .privilegedMode(privilegedMode.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .certificate(certificate.orNull)
      .image(image.orNull)
      .imagePullCredentialsType(imagePullCredentialsType.orNull)
      .environmentVariables(environmentVariables.map(_.asJava).orNull)
      .computeType(computeType.orNull)
      .registryCredential(registryCredential.orNull)
      .`type`(`type`.orNull)
      .build()
}
