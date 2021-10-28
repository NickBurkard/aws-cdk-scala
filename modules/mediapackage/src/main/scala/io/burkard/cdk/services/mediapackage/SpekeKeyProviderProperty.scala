package io.burkard.cdk.services.mediapackage

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SpekeKeyProviderProperty {

  def apply(
    resourceId: Option[String] = None,
    url: Option[String] = None,
    systemIds: Option[List[String]] = None,
    certificateArn: Option[String] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.SpekeKeyProviderProperty.Builder)
      .resourceId(resourceId.orNull)
      .url(url.orNull)
      .systemIds(systemIds.map(_.asJava).orNull)
      .certificateArn(certificateArn.orNull)
      .roleArn(roleArn.orNull)
      .build()
}
