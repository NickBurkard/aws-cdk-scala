package io.burkard.cdk.services.nimblestudio

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStreamingImage {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    ec2ImageId: Option[String] = None,
    studioId: Option[String] = None,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.nimblestudio.CfnStreamingImage =
    software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .ec2ImageId(ec2ImageId.orNull)
      .studioId(studioId.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
