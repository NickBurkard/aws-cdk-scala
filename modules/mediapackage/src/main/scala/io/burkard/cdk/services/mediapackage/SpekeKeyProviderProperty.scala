package io.burkard.cdk.services.mediapackage

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SpekeKeyProviderProperty {

  def apply(
    url: Option[String] = None,
    systemIds: Option[List[String]] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.SpekeKeyProviderProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.SpekeKeyProviderProperty.Builder)
      .url(url.orNull)
      .systemIds(systemIds.map(_.asJava).orNull)
      .roleArn(roleArn.orNull)
      .build()
}
