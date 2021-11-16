package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IotSiteWiseActionProperty {

  def apply(
    roleArn: String,
    putAssetPropertyValueEntries: List[_]
  ): software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty.Builder)
      .roleArn(roleArn)
      .putAssetPropertyValueEntries(putAssetPropertyValueEntries.asJava)
      .build()
}
