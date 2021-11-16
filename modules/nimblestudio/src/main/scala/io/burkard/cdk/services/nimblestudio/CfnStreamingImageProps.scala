package io.burkard.cdk.services.nimblestudio

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStreamingImageProps {

  def apply(
    name: String,
    ec2ImageId: String,
    studioId: String,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.nimblestudio.CfnStreamingImageProps =
    (new software.amazon.awscdk.services.nimblestudio.CfnStreamingImageProps.Builder)
      .name(name)
      .ec2ImageId(ec2ImageId)
      .studioId(studioId)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
