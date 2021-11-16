package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodeSigningConfigProps {

  def apply(
    signingProfiles: List[_ <: software.amazon.awscdk.services.signer.ISigningProfile],
    description: Option[String] = None,
    untrustedArtifactOnDeployment: Option[software.amazon.awscdk.services.lambda.UntrustedArtifactOnDeployment] = None
  ): software.amazon.awscdk.services.lambda.CodeSigningConfigProps =
    (new software.amazon.awscdk.services.lambda.CodeSigningConfigProps.Builder)
      .signingProfiles(signingProfiles.asJava)
      .description(description.orNull)
      .untrustedArtifactOnDeployment(untrustedArtifactOnDeployment.orNull)
      .build()
}
