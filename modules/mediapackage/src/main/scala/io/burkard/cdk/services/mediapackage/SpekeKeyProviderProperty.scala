package io.burkard.cdk.services.mediapackage

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SpekeKeyProviderProperty {

  def apply(
    resourceId: String,
    url: String,
    systemIds: List[String],
    roleArn: String,
    certificateArn: Option[String] = None
  ): software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty.Builder)
      .resourceId(resourceId)
      .url(url)
      .systemIds(systemIds.asJava)
      .roleArn(roleArn)
      .certificateArn(certificateArn.orNull)
      .build()
}
