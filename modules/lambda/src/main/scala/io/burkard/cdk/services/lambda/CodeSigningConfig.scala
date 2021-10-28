package io.burkard.cdk.services.lambda

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CodeSigningConfig {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    untrustedArtifactOnDeployment: Option[software.amazon.awscdk.services.lambda.UntrustedArtifactOnDeployment] = None,
    signingProfiles: Option[List[_ <: software.amazon.awscdk.services.signer.ISigningProfile]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lambda.CodeSigningConfig =
    software.amazon.awscdk.services.lambda.CodeSigningConfig.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .untrustedArtifactOnDeployment(untrustedArtifactOnDeployment.orNull)
      .signingProfiles(signingProfiles.map(_.asJava).orNull)
      .build()
}
