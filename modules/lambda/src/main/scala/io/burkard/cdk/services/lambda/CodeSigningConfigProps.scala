package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CodeSigningConfigProps {

  def apply(
    description: Option[String] = None,
    untrustedArtifactOnDeployment: Option[software.amazon.awscdk.services.lambda.UntrustedArtifactOnDeployment] = None,
    signingProfiles: Option[List[_ <: software.amazon.awscdk.services.signer.ISigningProfile]] = None
  ): software.amazon.awscdk.services.lambda.CodeSigningConfigProps =
    (new software.amazon.awscdk.services.lambda.CodeSigningConfigProps.Builder)
      .description(description.orNull)
      .untrustedArtifactOnDeployment(untrustedArtifactOnDeployment.orNull)
      .signingProfiles(signingProfiles.map(_.asJava).orNull)
      .build()
}
