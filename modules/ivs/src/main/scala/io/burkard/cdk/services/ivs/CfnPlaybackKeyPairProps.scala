package io.burkard.cdk.services.ivs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPlaybackKeyPairProps {

  def apply(
    publicKeyMaterial: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps =
    (new software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps.Builder)
      .publicKeyMaterial(publicKeyMaterial)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
