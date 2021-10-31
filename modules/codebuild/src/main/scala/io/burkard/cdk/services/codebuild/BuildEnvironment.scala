package io.burkard.cdk.services.codebuild

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BuildEnvironment {

  def apply(
    certificate: Option[software.amazon.awscdk.services.codebuild.BuildEnvironmentCertificate] = None,
    environmentVariables: Option[Map[String, _ <: software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable]] = None,
    computeType: Option[software.amazon.awscdk.services.codebuild.ComputeType] = None,
    privileged: Option[Boolean] = None,
    buildImage: Option[software.amazon.awscdk.services.codebuild.IBuildImage] = None
  ): software.amazon.awscdk.services.codebuild.BuildEnvironment =
    (new software.amazon.awscdk.services.codebuild.BuildEnvironment.Builder)
      .certificate(certificate.orNull)
      .environmentVariables(environmentVariables.map(_.asJava).orNull)
      .computeType(computeType.orNull)
      .privileged(privileged.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .buildImage(buildImage.orNull)
      .build()
}
