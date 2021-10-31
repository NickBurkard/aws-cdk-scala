package io.burkard.cdk.services.ivs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnChannelProps {

  def apply(
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    authorized: Option[Boolean] = None,
    latencyMode: Option[String] = None,
    `type`: Option[String] = None,
    recordingConfigurationArn: Option[String] = None
  ): software.amazon.awscdk.services.ivs.CfnChannelProps =
    (new software.amazon.awscdk.services.ivs.CfnChannelProps.Builder)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .authorized(authorized.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .latencyMode(latencyMode.orNull)
      .`type`(`type`.orNull)
      .recordingConfigurationArn(recordingConfigurationArn.orNull)
      .build()
}
