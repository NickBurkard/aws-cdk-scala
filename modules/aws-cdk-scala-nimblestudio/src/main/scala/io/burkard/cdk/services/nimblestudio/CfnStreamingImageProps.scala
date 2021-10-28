package io.burkard.cdk.services.nimblestudio

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStreamingImageProps {

  def apply(
    name: Option[String] = None,
    ec2ImageId: Option[String] = None,
    studioId: Option[String] = None,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.nimblestudio.CfnStreamingImageProps =
    (new software.amazon.awscdk.services.nimblestudio.CfnStreamingImageProps.Builder)
      .name(name.orNull)
      .ec2ImageId(ec2ImageId.orNull)
      .studioId(studioId.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
