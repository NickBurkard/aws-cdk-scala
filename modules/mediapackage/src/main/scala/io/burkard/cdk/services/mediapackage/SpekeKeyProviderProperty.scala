package io.burkard.cdk.services.mediapackage

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SpekeKeyProviderProperty {

  def apply(
    url: String,
    systemIds: List[String],
    roleArn: String
  ): software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.SpekeKeyProviderProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.SpekeKeyProviderProperty.Builder)
      .url(url)
      .systemIds(systemIds.asJava)
      .roleArn(roleArn)
      .build()
}
