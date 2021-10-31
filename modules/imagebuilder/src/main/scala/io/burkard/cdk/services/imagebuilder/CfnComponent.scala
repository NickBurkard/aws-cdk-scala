package io.burkard.cdk.services.imagebuilder

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnComponent {

  def apply(
    internalResourceId: String,
    changeDescription: Option[String] = None,
    name: Option[String] = None,
    data: Option[String] = None,
    uri: Option[String] = None,
    version: Option[String] = None,
    supportedOsVersions: Option[List[String]] = None,
    kmsKeyId: Option[String] = None,
    platform: Option[String] = None,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.imagebuilder.CfnComponent =
    software.amazon.awscdk.services.imagebuilder.CfnComponent.Builder
      .create(stackCtx, internalResourceId)
      .changeDescription(changeDescription.orNull)
      .name(name.orNull)
      .data(data.orNull)
      .uri(uri.orNull)
      .version(version.orNull)
      .supportedOsVersions(supportedOsVersions.map(_.asJava).orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .platform(platform.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
