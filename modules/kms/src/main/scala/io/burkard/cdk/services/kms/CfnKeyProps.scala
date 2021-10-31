package io.burkard.cdk.services.kms

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnKeyProps {

  def apply(
    keyUsage: Option[String] = None,
    pendingWindowInDays: Option[Number] = None,
    enabled: Option[Boolean] = None,
    keySpec: Option[String] = None,
    keyPolicy: Option[AnyRef] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    enableKeyRotation: Option[Boolean] = None,
    multiRegion: Option[Boolean] = None
  ): software.amazon.awscdk.services.kms.CfnKeyProps =
    (new software.amazon.awscdk.services.kms.CfnKeyProps.Builder)
      .keyUsage(keyUsage.orNull)
      .pendingWindowInDays(pendingWindowInDays.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .keySpec(keySpec.orNull)
      .keyPolicy(keyPolicy.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .enableKeyRotation(enableKeyRotation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .multiRegion(multiRegion.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
