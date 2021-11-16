package io.burkard.cdk.services.nimblestudio

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStreamingImage {

  def apply(
    internalResourceId: String,
    name: String,
    ec2ImageId: String,
    studioId: String,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.nimblestudio.CfnStreamingImage =
    software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .ec2ImageId(ec2ImageId)
      .studioId(studioId)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
