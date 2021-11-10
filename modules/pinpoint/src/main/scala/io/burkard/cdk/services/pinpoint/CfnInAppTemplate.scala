package io.burkard.cdk.services.pinpoint

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInAppTemplate {

  def apply(
    internalResourceId: String,
    templateDescription: Option[String] = None,
    tags: Option[AnyRef] = None,
    templateName: Option[String] = None,
    content: Option[List[_]] = None,
    customConfig: Option[AnyRef] = None,
    layout: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.pinpoint.CfnInAppTemplate =
    software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.Builder
      .create(stackCtx, internalResourceId)
      .templateDescription(templateDescription.orNull)
      .tags(tags.orNull)
      .templateName(templateName.orNull)
      .content(content.map(_.asJava).orNull)
      .customConfig(customConfig.orNull)
      .layout(layout.orNull)
      .build()
}
