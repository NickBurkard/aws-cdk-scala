package io.burkard.cdk.services.codebuild

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
