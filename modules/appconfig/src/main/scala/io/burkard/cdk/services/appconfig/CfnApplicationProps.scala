package io.burkard.cdk.services.appconfig

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationProps {

  def apply(
    name: String,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.appconfig.CfnApplication.TagsProperty]] = None
  ): software.amazon.awscdk.services.appconfig.CfnApplicationProps =
    (new software.amazon.awscdk.services.appconfig.CfnApplicationProps.Builder)
      .name(name)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
