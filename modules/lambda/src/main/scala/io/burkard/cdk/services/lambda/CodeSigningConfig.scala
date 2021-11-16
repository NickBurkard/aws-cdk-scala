package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodeSigningConfig {

  def apply(
    internalResourceId: String,
    signingProfiles: List[_ <: software.amazon.awscdk.services.signer.ISigningProfile],
    description: Option[String] = None,
    untrustedArtifactOnDeployment: Option[software.amazon.awscdk.services.lambda.UntrustedArtifactOnDeployment] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lambda.CodeSigningConfig =
    software.amazon.awscdk.services.lambda.CodeSigningConfig.Builder
      .create(stackCtx, internalResourceId)
      .signingProfiles(signingProfiles.asJava)
      .description(description.orNull)
      .untrustedArtifactOnDeployment(untrustedArtifactOnDeployment.orNull)
      .build()
}
