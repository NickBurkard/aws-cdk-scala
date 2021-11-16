package io.burkard.cdk.services.signer

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSigningProfileProps {

  def apply(
    platformId: String,
    signatureValidityPeriod: Option[software.amazon.awscdk.services.signer.CfnSigningProfile.SignatureValidityPeriodProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.signer.CfnSigningProfileProps =
    (new software.amazon.awscdk.services.signer.CfnSigningProfileProps.Builder)
      .platformId(platformId)
      .signatureValidityPeriod(signatureValidityPeriod.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
