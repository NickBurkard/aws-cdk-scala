package io.burkard.cdk.services.ivs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPlaybackKeyPairProps {

  def apply(
    name: Option[String] = None,
    publicKeyMaterial: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps =
    (new software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps.Builder)
      .name(name.orNull)
      .publicKeyMaterial(publicKeyMaterial.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
