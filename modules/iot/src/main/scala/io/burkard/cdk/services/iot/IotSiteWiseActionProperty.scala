package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IotSiteWiseActionProperty {

  def apply(
    roleArn: Option[String] = None,
    putAssetPropertyValueEntries: Option[List[_]] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty.Builder)
      .roleArn(roleArn.orNull)
      .putAssetPropertyValueEntries(putAssetPropertyValueEntries.map(_.asJava).orNull)
      .build()
}
