package io.burkard.cdk.services.pinpoint

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CampaignInAppMessageProperty {

  def apply(
    content: Option[List[_]] = None,
    customConfig: Option[AnyRef] = None,
    layout: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignInAppMessageProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignInAppMessageProperty.Builder)
      .content(content.map(_.asJava).orNull)
      .customConfig(customConfig.orNull)
      .layout(layout.orNull)
      .build()
}
