package io.burkard.cdk.services.pinpoint

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInAppTemplateProps {

  def apply(
    templateName: String,
    templateDescription: Option[String] = None,
    tags: Option[AnyRef] = None,
    content: Option[List[_]] = None,
    customConfig: Option[AnyRef] = None,
    layout: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnInAppTemplateProps =
    (new software.amazon.awscdk.services.pinpoint.CfnInAppTemplateProps.Builder)
      .templateName(templateName)
      .templateDescription(templateDescription.orNull)
      .tags(tags.orNull)
      .content(content.map(_.asJava).orNull)
      .customConfig(customConfig.orNull)
      .layout(layout.orNull)
      .build()
}
